package io.github.pmackowski.rsocket.raft;

import io.github.pmackowski.rsocket.raft.transport.protobuf.*;
import io.rsocket.Payload;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RaftGroups {

    private static final Logger LOGGER = LoggerFactory.getLogger(RaftGroups.class);

    private InnerNode node;
    private ScheduledExecutorService stateMachineExecutor;
    private Map<String, RaftGroup> raftGroups = new ConcurrentHashMap<>();

    public RaftGroups(InnerNode node) {
        this.node = node;
        // TODO initialize from storage
    }

    void start() {
        LOGGER.info("[Server {}] start groups", node.nodeId);
        raftGroups.values().forEach(raftGroup -> raftGroup.onInit(raftServer));
        stateMachineExecutor = Executors.newScheduledThreadPool(1);
        stateMachineExecutor.scheduleWithFixedDelay(() -> {
            try {
                raftGroups.values().forEach(raftGroup -> raftGroup.advanceStateMachine(node));
            } catch (Exception e) {
                LOGGER.error("Main loop failure", e);
            }
        }, 0, 10, TimeUnit.MILLISECONDS);

    }

    public void addGroup(RaftGroup raftGroup) {
        raftGroups.put(raftGroup.getGroupName(), raftGroup);
        //raftGroup.onInit(node);
    }

    void dispose(DefaultNode raftServer) {
        raftGroups.values().forEach(raftGroup -> raftGroup.onExit(raftServer, raftStorage));
        stateMachineExecutor.shutdownNow();
    }

    public Mono<Payload> onClientRequest(Payload payload) {
        String groupName = payload.getMetadataUtf8();
        RaftGroup raftGroup = raftGroups.get(groupName);
        return raftGroup.onClientRequest(node, payload);
    }

    public Flux<Payload> onClientRequests(Publisher<Payload> payloads) {
        return Flux.from(payloads)
                   .switchOnFirst(((signal, payloadFlux) -> {
                       Payload firstPayload = signal.get();
                       String groupName = firstPayload.getMetadataUtf8();
                       RaftGroup raftGroup = raftGroups.get(groupName);
                       return raftGroup.onClientRequests(node,raftStorage, payloadFlux);
                   }));
    }

    public Mono<AppendEntriesResponse> onAppendEntries(String groupName, AppendEntriesRequest appendEntries) {
        RaftGroup raftGroup = raftGroups.get(groupName);
        return raftGroup.onAppendEntries(defaultRaftServer, raftStorage, appendEntries)
                .doOnNext(response -> {
                    if (response.getSuccess()) {
                        raftGroup.setCurrentLeader(appendEntries.getLeaderId());
                        if (appendEntries.getEntriesCount() > 0) {
                            LOGGER.info("[Node {} -> Node {}] Append entries \n{} \n-> \n{}", appendEntries.getLeaderId(), nodeId, appendEntries, response);
                        }
                    }
                });
    }

    public Mono<PreVoteResponse> onPreRequestVote(String groupName, PreVoteRequest preRequestVote) {
        RaftGroup raftGroup = raftGroups.get(groupName);
        return raftGroup.onPreRequestVote(defaultRaftServer, raftStorage, preRequestVote)
                .doOnNext(preVoteResponse -> LOGGER.info("[Node {} -> Node {}] Pre-Vote \n{} \n-> \n{}", preRequestVote.getCandidateId(), nodeId, preRequestVote, preVoteResponse));

    }

    public Mono<VoteResponse> onRequestVote(String groupName, VoteRequest requestVote) {
        RaftGroup raftGroup = raftGroups.get(groupName);
        return raftGroup.onRequestVote(defaultRaftServer, raftStorage, requestVote)
                .doOnNext(voteResponse -> LOGGER.info("[Node {} -> Node {}] Vote \n{} \n-> \n{}", requestVote.getCandidateId(), nodeId, requestVote, voteResponse));
    }

    public Mono<AddServerResponse> onAddServer(String groupName, AddServerRequest addServerRequest) {
        RaftGroup raftGroup = raftGroups.get(groupName);
        return raftGroup.onAddServer(defaultRaftServer, raftStorage, addServerRequest)
                .doOnNext(addServerResponse -> LOGGER.info("[Node {}] Add server \n{} \n-> \n{}", nodeId, addServerRequest.getNewServer(), addServerResponse.getStatus()));
    }

    public Mono<RemoveServerResponse> onRemoveServer(String groupName, RemoveServerRequest removeServerRequest) {
        RaftGroup raftGroup = raftGroups.get(groupName);
        return raftGroup.onRemoveServer(defaultRaftServer, raftStorage, removeServerRequest)
                .doOnNext(removeServerResponse -> LOGGER.info("[Node {}] Remove server \n{} \n-> \n{}", nodeId, removeServerRequest.getOldServer(), removeServerResponse.getStatus()));
    }

    public void convertToFollower(int term) {

    }

    public RaftGroup getByName(String name) {
        return raftGroups.get(name);
    }
}
