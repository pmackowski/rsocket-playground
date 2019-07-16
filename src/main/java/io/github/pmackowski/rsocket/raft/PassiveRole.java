package io.github.pmackowski.rsocket.raft;

import io.github.pmackowski.rsocket.raft.storage.RaftStorage;
import io.github.pmackowski.rsocket.raft.storage.log.entry.IndexedLogEntry;
import io.github.pmackowski.rsocket.raft.storage.log.entry.LogEntry;
import io.github.pmackowski.rsocket.raft.storage.log.serializer.LogEntrySerializer;
import io.github.pmackowski.rsocket.raft.transport.protobuf.AppendEntriesRequest;
import io.github.pmackowski.rsocket.raft.transport.protobuf.AppendEntriesResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;

public class PassiveRole implements RaftRole {

    private static final Logger LOGGER = LoggerFactory.getLogger(PassiveRole.class);

    @Override
    public NodeState nodeState() {
        return NodeState.PASSIVE;
    }

    @Override
    public void onInit(InnerNode node, RaftGroup raftGroup, RaftStorage raftStorage) {
        LOGGER.info("[Node {}] Passive", node.getNodeId());
    }

    @Override
    public void onExit(InnerNode node, RaftGroup raftGroup, RaftStorage raftStorage) {

    }

    @Override
    public Mono<AppendEntriesResponse> onAppendEntries(InnerNode node, RaftGroup raftGroup, RaftStorage raftStorage, AppendEntriesRequest appendEntries) {
        return Mono.just(appendEntries)
                .map(appendEntriesRequest -> {
                    int currentTerm = raftStorage.getTerm();
                    if (appendEntriesRequest.getTerm() > currentTerm) {
                        raftStorage.update(appendEntriesRequest.getTerm(), 0);
                    }

                    // 1. Reply false if term < currentTerm
                    if (appendEntriesRequest.getTerm() < currentTerm) {
                        return replyFalse(raftStorage, currentTerm);
                    }

                    // 2. Reply false if log doesn’t contain an entry at prevLogIndex
                    //    whose term matches prevLogTerm
                    int prevLogTerm = raftStorage.getTermByIndex(appendEntriesRequest.getPrevLogIndex());
                    if (prevLogTerm != appendEntriesRequest.getPrevLogTerm()) {
                        return replyFalse(raftStorage, currentTerm);
                    }

                    // 3. If an existing entry conflicts with a new one (same index
                    //    but different terms), delete the existing entry and all that
                    //    follow it
                    if (raftStorage.getLastIndexedTerm().getIndex() > appendEntriesRequest.getPrevLogIndex()) {
                        raftStorage.truncateFromIndex(appendEntriesRequest.getPrevLogIndex() + 1);
                    }

                    // 4. Append any new entries not already in the log
                    appendEntriesRequest.getEntriesList().forEach(entry -> {
                        ByteBuffer byteBuffer = entry.asReadOnlyByteBuffer();
                        LogEntry logEntry = LogEntrySerializer.deserialize(byteBuffer);
                        IndexedLogEntry indexedLogEntry = raftStorage.append(logEntry);
                        raftGroup.applyPassive(indexedLogEntry);
                    });

                    return replyTrue(currentTerm);
                });
    }

    private AppendEntriesResponse replyFalse(RaftStorage raftStorage, int currentTerm) {
        final long lastLogIndex = raftStorage.getLastIndexedTerm().getIndex();
        return AppendEntriesResponse.newBuilder()
                .setTerm(currentTerm)
                .setSuccess(false)
                .setLastLogIndex(lastLogIndex)
                .build();
    }

    private AppendEntriesResponse replyTrue(int currentTerm) {
//        final long lastLogIndex = raftStorage.getLastIndexedTerm().getIndex();
        return AppendEntriesResponse.newBuilder()
                .setTerm(currentTerm)
                .setSuccess(true)
                .build();
    }
}
