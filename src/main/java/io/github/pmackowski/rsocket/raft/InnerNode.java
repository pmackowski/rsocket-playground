package io.github.pmackowski.rsocket.raft;

import io.github.pmackowski.rsocket.raft.client.protobuf.InfoRequest;
import io.github.pmackowski.rsocket.raft.client.protobuf.InfoResponse;
import io.github.pmackowski.rsocket.raft.listener.SenderAvailableListener;
import io.github.pmackowski.rsocket.raft.listener.SenderUnavailableListener;
import io.github.pmackowski.rsocket.raft.transport.Sender;
import io.github.pmackowski.rsocket.raft.transport.Senders;
import reactor.core.publisher.Mono;

public interface InnerNode extends Node {

    void senderAvailable(Sender sender);

    void senderUnavailable(Sender sender);

    void onSenderAvailable(SenderAvailableListener senderAvailableListener);

    void onSenderUnavailable(SenderUnavailableListener senderUnavailableListener);

    Mono<InfoResponse> onInfoRequest(InfoRequest infoRequest);

    Senders getSenders();
}
