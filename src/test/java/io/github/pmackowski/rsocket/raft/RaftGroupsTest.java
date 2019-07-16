package io.github.pmackowski.rsocket.raft;

import io.github.pmackowski.rsocket.raft.external.statemachine.KVStateMachine1;
import io.github.pmackowski.rsocket.raft.external.statemachine.KVStateMachineEntryConverter;
import io.github.pmackowski.rsocket.raft.external.statemachine.KVStoreClient;
import io.github.pmackowski.rsocket.raft.external.statemachine.KeyValue;
import io.github.pmackowski.rsocket.raft.storage.InMemoryRaftStorage;
import io.github.pmackowski.rsocket.raft.storage.RaftStorage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.blockhound.BlockHound;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static io.github.pmackowski.rsocket.raft.gossip.Cluster.DEFAULT_THREE_NODE_CLUSTER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@IntegrationTest
class RaftGroupsTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(RaftGroupsTest.class);

    private static final boolean PRE_VOTE = true; // TODO add new tests for pre vote
    private static final boolean LEADER_STICKINESS = true; // TODO add new tests for leader stickiness

    @Mock
    ElectionTimeout electionTimeout1, electionTimeout2, electionTimeout3, electionTimeout4;

    Mono<Node> raftServerMono1, raftServerMono2, raftServerMono3, raftServerMono4;
    Node raftServer1, raftServer2, raftServer3, raftServer4;
    RaftStorage raftStorage1, raftStorage2, raftStorage3, raftStorage4;

    @BeforeEach
    public void setUp() {
        BlockHound.builder()
                .allowBlockingCallsInside("java.io.FileInputStream", "readBytes")
                .install();

        RaftConfiguration.Builder defaultBuilder = RaftConfiguration.builder()
                .leaderStickiness(LEADER_STICKINESS)
                .preVote(PRE_VOTE)
                .stateMachineEntryConverter(new KVStateMachineEntryConverter());

        raftServerMono1 = new NodeBuilder()
                .nodeId(7000)
                .raftConfiguration(defaultBuilder, builder -> builder.stateMachine(new KVStateMachine1(7000)).electionTimeout(electionTimeout1))
                .cluster(DEFAULT_THREE_NODE_CLUSTER)
                .start();

        raftServerMono2 = new NodeBuilder()
                .nodeId(7001)
                .raftConfiguration(defaultBuilder, builder -> builder.stateMachine(new KVStateMachine1(7001)).electionTimeout(electionTimeout2))
                .cluster(DEFAULT_THREE_NODE_CLUSTER)
                .start();

        raftServerMono3 = new NodeBuilder()
                .nodeId(7002)
                .raftConfiguration(defaultBuilder, builder -> builder.stateMachine(new KVStateMachine1(7002)).electionTimeout(electionTimeout3))
                .cluster(DEFAULT_THREE_NODE_CLUSTER)
                .start();
    }

    @Test
    void testElection() {
        given(electionTimeout1.nextRandom()).willReturn(Duration.ofMillis(300));
        given(electionTimeout2.nextRandom()).willReturn(Duration.ofSeconds(10));
//        given(electionTimeout3.nextRandom()).willReturn(Duration.ofMillis(300));

        raftServer1 = raftServerMono1.block();
        raftServer2 = raftServerMono2.block();
        raftServer3 = raftServerMono3.block();

        final RaftGroup raftServer1Group1 = new RaftGroup(new InMemoryRaftStorage(), (DefaultNode) raftServer1, "group1", Arrays.asList(7000, 7001));
        raftServer1.addGroup(raftServer1Group1);
        final RaftGroup raftServer2Group1 = new RaftGroup(new InMemoryRaftStorage(), (DefaultNode) raftServer2, "group1", Arrays.asList(7000, 7001));
        raftServer2.addGroup(raftServer2Group1);
        final RaftGroup raftServer3Group1 = new RaftGroup(new InMemoryRaftStorage(), (DefaultNode) raftServer3, "group2", Arrays.asList(7002) );
        raftServer3.addGroup(raftServer3Group1);

        ((DefaultNode) raftServer1).startGroups();
        ((DefaultNode) raftServer2).startGroups();
        ((DefaultNode) raftServer3).startGroups();

        await().atMost(5, TimeUnit.SECONDS).until(() -> raftServer1Group1.getCurrentLeaderId() == 7000);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer2Group1.getCurrentLeaderId() == 7000);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer3Group1.getCurrentLeaderId() == 7002);

        assertThat(raftServer1Group1.isLeader()).isTrue();
        assertThat(raftServer2Group1.isFollower()).isTrue();
        assertThat(raftServer3Group1.isLeader()).isTrue();
    }

    @Test
    void testLogReplication() {
        testElection();

        KVStoreClient kvStoreClient = new KVStoreClient(7000);

        int nbEntries = 10;

        kvStoreClient.put("group1", Flux.range(1, nbEntries).delayElements(Duration.ofMillis(500)).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("KVStoreClient started"))
                .doOnNext(s -> LOGGER.info("KVStoreClient received {}", s))
                .doOnComplete(() -> LOGGER.info("KVStoreClient finished"))
                .blockLast();
    }

    @AfterEach
    void tearDown() {
        raftServer1.dispose();
        raftServer2.dispose();
        raftServer3.dispose();
        if (raftServer4 != null) {
            raftServer4.dispose();
        }
    }
}