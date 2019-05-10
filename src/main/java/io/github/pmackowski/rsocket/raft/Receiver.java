package io.github.pmackowski.rsocket.raft;

import com.google.protobuf.InvalidProtocolBufferException;
import io.github.pmackowski.rsocket.raft.rpc.AppendEntriesRequest;
import io.github.pmackowski.rsocket.raft.rpc.VoteRequest;
import io.github.pmackowski.rsocket.raft.utils.NettyUtils;
import io.rsocket.*;
import io.rsocket.transport.netty.server.CloseableChannel;
import io.rsocket.transport.netty.server.TcpServerTransport;
import io.rsocket.util.ByteBufPayload;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private DefaultRaftServer node;
    private CloseableChannel requestVoteCancellation, appendEntriesCancellation, clientCancellation;

    public Receiver(DefaultRaftServer node) {
        this.node = node;
    }

    public void start() {
        requestVoteCancellation = RSocketFactory.receive()
                .acceptor(new RequestVoteSocketAcceptor(node))
                .transport(TcpServerTransport.create(node.nodeId))
                .start()
                .block();

//        requestVoteCancellation.onClose()
//                .doFinally(signalType -> LOGGER.warn("[KVStoreServerImpl {}] RequestVote onClose", node.nodeId))
//                .subscribe();

        appendEntriesCancellation = RSocketFactory.receive()
                .acceptor(new AppendEntriesSocketAcceptor(node))
                .transport(TcpServerTransport.create(node.nodeId + 10000))
                .start()
                .block();
//        appendEntriesCancellation.onClose()
//                .doFinally(signalType -> LOGGER.warn("[KVStoreServerImpl {}] Append entries onClose", node.nodeId))
//                .subscribe();

        clientCancellation = RSocketFactory.receive()
                .acceptor(new ClientSocketAcceptor(node))
                .transport(TcpServerTransport.create(node.nodeId + 20000))
                .start()
                .block();
//        clientCancellation.onClose()
//                .doFinally(signalType -> LOGGER.warn("[KVStoreServerImpl {}] Client onClose", node.nodeId))
//                .subscribe();
    }

    public void stop() {
        requestVoteCancellation.dispose();
        appendEntriesCancellation.dispose();
        clientCancellation.dispose();
    }

    private static class ClientSocketAcceptor implements SocketAcceptor {

        private DefaultRaftServer node;

        public ClientSocketAcceptor(DefaultRaftServer node) {
            this.node = node;
        }

        @Override
        public Mono<RSocket> accept(ConnectionSetupPayload setup, RSocket sendingSocket) {
            return Mono.just(new AbstractRSocket() {

                @Override
                public Mono<Payload> requestResponse(Payload payload) {
                    return node.onClientRequest(payload);
                }

                @Override
                public Flux<Payload> requestChannel(Publisher<Payload> payloads) {
                    return node.onClientRequests(payloads);
                }
            });
        }
    }

    private static class RequestVoteSocketAcceptor implements SocketAcceptor {

        private DefaultRaftServer node;

        public RequestVoteSocketAcceptor(DefaultRaftServer node) {
            this.node = node;
        }

        @Override
        public Mono<RSocket> accept(ConnectionSetupPayload setup, RSocket sendingSocket) {
            return Mono.just(new AbstractRSocket() {
                @Override
                public Mono<Payload> requestResponse(Payload payload) {
                    return Mono.just(payload)
                            .map(payload1 -> {
                                try {
                                    return VoteRequest.parseFrom(NettyUtils.toByteArray(payload1.sliceData()));
                                } catch (InvalidProtocolBufferException e) {
                                    throw new RaftException("Invalid vote request!", e);
                                }
                            })
                            .flatMap(voteRequest -> node.onRequestVote(voteRequest))
                            .map(voteResponse -> ByteBufPayload.create(voteResponse.toByteArray()));
                }
            });
        }
    }

    private static class AppendEntriesSocketAcceptor implements SocketAcceptor {

        private DefaultRaftServer node;

        public AppendEntriesSocketAcceptor(DefaultRaftServer node) {
            this.node = node;
        }

        @Override
        public Mono<RSocket> accept(ConnectionSetupPayload setup, RSocket sendingSocket) {
            return Mono.just(new AbstractRSocket() {

                @Override
                public Mono<Payload> requestResponse(Payload payload) {
                    return Mono
                            .just(payload)
                            .map(payload1 -> {
                                try {
                                    return AppendEntriesRequest.parseFrom(NettyUtils.toByteArray(payload1.sliceData()));
                                } catch (InvalidProtocolBufferException e) {
                                    throw new RaftException("Invalid append entries request!", e);
                                }
                            })
                            .flatMap(appendEntriesRequest -> node.onAppendEntries(appendEntriesRequest))
                            .map(appendEntriesResponse -> ByteBufPayload.create(appendEntriesResponse.toByteArray()));
                }
            });
        }
    }
}