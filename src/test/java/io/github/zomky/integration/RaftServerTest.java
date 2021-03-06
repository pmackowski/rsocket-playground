package io.github.zomky.integration;

import io.github.zomky.IntegrationTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@IntegrationTest
class RaftServerTest {
/*
    private static final Logger LOGGER = LoggerFactory.getLogger(RaftServerTest.class);

    private static final boolean PRE_VOTE = false; // TODO add new tests for pre vote
    private static final boolean LEADER_STICKINESS = false; // TODO add new tests for leader stickiness

    @TempDir
    Path folder;

    @Mock
    ElectionTimeout electionTimeout1, electionTimeout2, electionTimeout3, electionTimeout4;

    Mono<Node> raftServerMono1, raftServerMono2, raftServerMono3, raftServerMono4;
    Node raftServer1, raftServer2, raftServer3, raftServer4;
    RaftStorage raftStorage1, raftStorage2, raftStorage3, raftStorage4;

    private RaftStorage raftStorage(String node) {
        return new FileSystemRaftStorage(RaftStorageConfiguration.builder()
                .segmentSize(SizeUnit.megabytes, 1)
                .directory(Paths.get(folder.toAbsolutePath().toString(), "node" + node))
                .build()
        );
    }

    @BeforeEach
    public void setUp() {
        BlockHound.builder()
                .allowBlockingCallsInside("java.io.FileInputStream", "readBytes")
                .install();

        LOGGER.info("Raft directory {}", folder.toAbsolutePath().toString());
        raftStorage1 = raftStorage("1");
        raftStorage2 = raftStorage("2");
        raftStorage3 = raftStorage("3");
        raftStorage4 = raftStorage("4");

        raftServerMono1 = new NodeFactory()
                .nodeId(7000)
                .storage(raftStorage1)
                .stateMachine(new KVStateMachine(7000))
                .stateMachineEntryConverter(new KVStateMachineEntryConverter())
                .electionTimeout(electionTimeout1)
                .preVote(PRE_VOTE)
                .leaderStickiness(LEADER_STICKINESS)
                .start();
        raftServerMono2 = new NodeFactory()
                .nodeId(7001)
                .storage(raftStorage2)
                .stateMachine(new KVStateMachine(7001))
                .stateMachineEntryConverter(new KVStateMachineEntryConverter())
                .electionTimeout(electionTimeout2)
                .preVote(PRE_VOTE)
                .leaderStickiness(LEADER_STICKINESS)
                .start();
        raftServerMono3 = new NodeFactory()
                .nodeId(7002)
                .storage(raftStorage3)
                .stateMachine(new KVStateMachine(7002))
                .stateMachineEntryConverter(new KVStateMachineEntryConverter())
                .electionTimeout(electionTimeout3)
                .preVote(PRE_VOTE)
                .leaderStickiness(LEADER_STICKINESS)
                .start();
    }

    @AfterEach
    void tearDown() {
        raftStorage1.close();
        raftStorage2.close();
        raftStorage3.close();
        if (raftStorage4 != null) {
            raftStorage4.close();
        }
        raftServer1.dispose();
        raftServer2.dispose();
        raftServer3.dispose();
        if (raftServer4 != null) {
            raftServer4.dispose();
        }
    }

    @Test
    void testElection() {
        given(electionTimeout1.nextRandom()).willReturn(Duration.ofMillis(300));
        given(electionTimeout2.nextRandom()).willReturn(Duration.ofSeconds(10));
        given(electionTimeout3.nextRandom()).willReturn(Duration.ofSeconds(10));

        raftServer1 = raftServerMono1.block();
        raftServer2 = raftServerMono2.block();
        raftServer3 = raftServerMono3.block();

        await().atMost(5, TimeUnit.SECONDS).until(() -> raftServer1.getCurrentLeaderId() == 7000);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer2.getCurrentLeaderId() == 7000);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer3.getCurrentLeaderId() == 7000);

        assertThat(raftServer1.isLeader()).isTrue();
        assertThat(raftServer2.isFollower()).isTrue();
        assertThat(raftServer3.isFollower()).isTrue();

        assertThat(raftStorage1.getTerm()).isGreaterThanOrEqualTo(1);
        assertThat(raftStorage1.getVotedFor()).isEqualTo(7000);
        assertThat(raftStorage2.getTerm()).isGreaterThanOrEqualTo(1);
        assertThat(raftStorage2.getVotedFor()).isEqualTo(7000);
        assertThat(raftStorage3.getTerm()).isGreaterThanOrEqualTo(1);
        assertThat(raftStorage3.getVotedFor()).isEqualTo(7000);
        assertThat(raftStorage1.getLastIndexedTerm().getIndex()).isEqualTo(0);
    }

    @Test
    void leaderFailure() {
        given(electionTimeout1.nextRandom()).willReturn(Duration.ofMillis(300));
        given(electionTimeout2.nextRandom()).willReturn(Duration.ofMillis(1000));
        given(electionTimeout3.nextRandom()).willReturn(Duration.ofSeconds(10));

        raftServer1 = raftServerMono1.block();
        raftServer2 = raftServerMono2.block();
        raftServer3 = raftServerMono3.block();

        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer1.getCurrentLeaderId() == 7000);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer2.getCurrentLeaderId() == 7000);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer3.getCurrentLeaderId() == 7000);

        assertThat(raftServer1.isLeader()).isTrue();
        assertThat(raftServer2.isFollower()).isTrue();
        assertThat(raftServer3.isFollower()).isTrue();

        assertThat(raftStorage1.getTerm()).isGreaterThanOrEqualTo(1);
        assertThat(raftStorage1.getVotedFor()).isEqualTo(7000);
        assertThat(raftStorage2.getTerm()).isGreaterThanOrEqualTo(1);
        assertThat(raftStorage2.getVotedFor()).isEqualTo(7000);
        assertThat(raftStorage3.getTerm()).isGreaterThanOrEqualTo(1);
        assertThat(raftStorage3.getVotedFor()).isEqualTo(7000);
        assertThat(raftStorage1.getTerm()).isEqualTo(raftStorage2.getTerm());

        int currentTerm = raftStorage1.getTerm();

        raftServer1.dispose();

        await().atMost(2, TimeUnit.SECONDS).until(() -> raftServer2.getCurrentLeaderId() == 7001);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer3.getCurrentLeaderId() == 7001);
        assertThat(raftServer2.isLeader()).isTrue();
        assertThat(raftServer3.isFollower()).isTrue();
        assertThat(raftStorage1.getTerm()).isEqualTo(currentTerm);
        assertThat(raftStorage1.getVotedFor()).isEqualTo(7000);
        assertThat(raftStorage2.getTerm()).isGreaterThan(currentTerm);
        assertThat(raftStorage2.getVotedFor()).isEqualTo(7001);
        assertThat(raftStorage3.getTerm()).isGreaterThan(currentTerm);
        assertThat(raftStorage3.getVotedFor()).isEqualTo(7001);
    }

    @Test
    void testLogReplication() {
        testElection();

        KVStoreClient kvStoreClient = new KVStoreClient(Arrays.asList(7000));
        kvStoreClient.start();

        int nbEntries = 10;

        kvStoreClient.put(Flux.range(1, nbEntries).delayElements(Duration.ofMillis(500)).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("KVStoreClient started"))
                .doOnNext(s -> LOGGER.info("KVStoreClient received {}", s))
                .doOnComplete(() -> LOGGER.info("KVStoreClient finished"))
                .blockLast();

        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage1.getLastIndexedTerm().getIndex() == nbEntries);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage2.getLastIndexedTerm().getIndex() == nbEntries);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage3.getLastIndexedTerm().getIndex() == nbEntries);

    }

    @Test
    void testLogReplicationWithConfigurationChange() {
        testElection();

        KVStoreClient kvStoreClient = new KVStoreClient(Arrays.asList(7000));
        kvStoreClient.start();

        int nbEntries = 10;


        given(electionTimeout4.nextRandom()).willReturn(Duration.ofSeconds(10));
        raftServerMono4 = new NodeFactory()
                .nodeId(7003)
                .storage(raftStorage4)
                .stateMachine(new KVStateMachine(7003))
                .stateMachineEntryConverter(new KVStateMachineEntryConverter())
                .electionTimeout(electionTimeout4)
                .preVote(PRE_VOTE)
                .leaderStickiness(LEADER_STICKINESS)
                .start();

        raftServer4 = raftServerMono4.block();

        kvStoreClient.put(Flux.range(1, nbEntries).delayElements(Duration.ofMillis(500)).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("KVStoreClient started"))
                .doOnNext(s -> LOGGER.info("KVStoreClient received {}", s))
                .flatMap(s -> {
                    if ("val4".equals(s.getValue())) {
                        return raftServer1.onAddServer(groupName, AddServerRequest.newBuilder().setNewServer(7003).build());
                    } else {
                        return Flux.empty();
                    }
                })
                .doOnComplete(() -> LOGGER.info("KVStoreClient finished"))
                .blockLast();

        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage1.getLastIndexedTerm().getIndex() == nbEntries + 1);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage2.getLastIndexedTerm().getIndex() == nbEntries + 1);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage3.getLastIndexedTerm().getIndex() == nbEntries + 1);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage4.getLastIndexedTerm().getIndex() == nbEntries + 1);
    }

    @Test
    void testLogReplicationWithConfigurationChangeRemoveServer() {
        testElection();

        KVStoreClient kvStoreClient = new KVStoreClient(Arrays.asList(7000));
        kvStoreClient.start();

        int nbEntries = 10;

        kvStoreClient.put(Flux.range(1, nbEntries).delayElements(Duration.ofMillis(500)).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("KVStoreClient started"))
                .doOnNext(s -> LOGGER.info("KVStoreClient received {}", s))
                .flatMap(s -> {
                    if ("val4".equals(s.getValue())) {
                        return raftServer1.onRemoveServer(groupName, RemoveServerRequest.newBuilder().setOldServer(7002).build());
                    } else {
                        return Flux.empty();
                    }
                })
                .doOnComplete(() -> LOGGER.info("KVStoreClient finished"))
                .blockLast();

        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage1.getLastIndexedTerm().getIndex() == nbEntries + 1);
        await().atMost(1, TimeUnit.SECONDS).until(() -> raftStorage2.getLastIndexedTerm().getIndex() == nbEntries + 1);
//        await().atMost(1, TimeUnit.SECONDS).until(() -> raftServer3.isPassive());
    }

    @Test
    void testLogReplicationMultipleClients() {
        testElection();

        KVStoreClient kvStoreClient = new KVStoreClient(Arrays.asList(7000));
        kvStoreClient.start();

        int nbEntries = 10;

        kvStoreClient.put(Flux.range(1, nbEntries).delayElements(Duration.ofMillis(500)).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("KVStoreClient started"))
                .doOnNext(s -> LOGGER.info("KVStoreClient received {}", s))
                .doOnComplete(() -> LOGGER.info("KVStoreClient finished"))
                .subscribe();

        kvStoreClient.put(Flux.range(11, nbEntries).delayElements(Duration.ofMillis(500)).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("Client2 started"))
                .doOnNext(s -> LOGGER.info("Client2 received {}", s))
                .doOnComplete(() -> LOGGER.info("Client2 finished"))
                .subscribe();

        await().atMost(10, TimeUnit.SECONDS).until(() -> raftStorage1.getLastIndexedTerm().getIndex() == nbEntries * 2);
        await().atMost(10, TimeUnit.SECONDS).until(() -> raftStorage2.getLastIndexedTerm().getIndex() == nbEntries * 2);
        await().atMost(10, TimeUnit.SECONDS).until(() -> raftStorage2.getLastIndexedTerm().getIndex() == nbEntries * 2);
    }

    @Test
    void testLogReplicationWithLeaderFailure() throws InterruptedException {
        testElection();

        KVStoreClient kvStore = new KVStoreClient(Arrays.asList(7000));
        kvStore.start();

        int nbEntries = 10;

        kvStore.put(Flux.range(1, nbEntries).delayElements(Duration.ofMillis(100)).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("Client1 started"))
                .doOnNext(s -> LOGGER.info("Client1 received {}", s))
                .doOnComplete(() -> LOGGER.info("Client1 finished"))
                .blockLast();

        Thread.sleep(3000);

        raftServer1.dispose();
        raftServer2.dispose();
        raftServer3.dispose();

        Thread.sleep(2000);

        given(electionTimeout1.nextRandom()).willReturn(Duration.ofSeconds(10));
        given(electionTimeout2.nextRandom()).willReturn(Duration.ofMillis(300));
        given(electionTimeout3.nextRandom()).willReturn(Duration.ofSeconds(1));

        raftServer1 = raftServerMono1.block();
        raftServer2 = raftServerMono2.block();
        raftServer3 = raftServerMono3.block();

        KVStoreClient kvStore2 = new KVStoreClient(Arrays.asList(7001));
        kvStore2.start();

        Thread.sleep(2000);
        kvStore2.put(Flux.range(11, nbEntries).map(i -> new KeyValue("key" + i, "val" + i)))
                .doOnSubscribe(subscription -> LOGGER.info("Client2 started"))
                .doOnNext(s -> LOGGER.info("Client2 received {}", s))
                .doOnComplete(() -> LOGGER.info("Client2 finished"))
                .blockLast();

        await().atMost(10, TimeUnit.SECONDS).until(() -> raftStorage1.getLastIndexedTerm().getIndex() == nbEntries * 2);
        await().atMost(10, TimeUnit.SECONDS).until(() -> raftStorage2.getLastIndexedTerm().getIndex() == nbEntries * 2);
        await().atMost(10, TimeUnit.SECONDS).until(() -> raftStorage3.getLastIndexedTerm().getIndex() == nbEntries * 2);
    }
*/
}