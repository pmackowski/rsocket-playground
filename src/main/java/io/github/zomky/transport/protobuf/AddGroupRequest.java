// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.zomky.transport.protobuf;

/**
 * Protobuf type {@code AddGroupRequest}
 */
public  final class AddGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddGroupRequest)
    AddGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddGroupRequest.newBuilder() to construct.
  private AddGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddGroupRequest() {
    stateMachine_ = "";
    nodes_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddGroupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddGroupRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            leaderIdSuggestion_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stateMachine_ = s;
            break;
          }
          case 24: {

            electionTimeoutMin_ = input.readInt32();
            break;
          }
          case 32: {

            electionTimeoutMax_ = input.readInt32();
            break;
          }
          case 40: {

            passive_ = input.readBool();
            break;
          }
          case 48: {

            persistentStorage_ = input.readBool();
            break;
          }
          case 56: {

            segmentSize_ = input.readInt32();
            break;
          }
          case 64: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nodes_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            nodes_.addInt(input.readInt32());
            break;
          }
          case 66: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              nodes_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              nodes_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nodes_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.github.zomky.transport.protobuf.Raft.internal_static_AddGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.zomky.transport.protobuf.Raft.internal_static_AddGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.zomky.transport.protobuf.AddGroupRequest.class, io.github.zomky.transport.protobuf.AddGroupRequest.Builder.class);
  }

  public static final int LEADER_ID_SUGGESTION_FIELD_NUMBER = 1;
  private int leaderIdSuggestion_;
  /**
   * <code>int32 leader_id_suggestion = 1;</code>
   */
  public int getLeaderIdSuggestion() {
    return leaderIdSuggestion_;
  }

  public static final int STATE_MACHINE_FIELD_NUMBER = 2;
  private volatile java.lang.Object stateMachine_;
  /**
   * <code>string state_machine = 2;</code>
   */
  public java.lang.String getStateMachine() {
    java.lang.Object ref = stateMachine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stateMachine_ = s;
      return s;
    }
  }
  /**
   * <code>string state_machine = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStateMachineBytes() {
    java.lang.Object ref = stateMachine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stateMachine_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ELECTION_TIMEOUT_MIN_FIELD_NUMBER = 3;
  private int electionTimeoutMin_;
  /**
   * <code>int32 election_timeout_min = 3;</code>
   */
  public int getElectionTimeoutMin() {
    return electionTimeoutMin_;
  }

  public static final int ELECTION_TIMEOUT_MAX_FIELD_NUMBER = 4;
  private int electionTimeoutMax_;
  /**
   * <code>int32 election_timeout_max = 4;</code>
   */
  public int getElectionTimeoutMax() {
    return electionTimeoutMax_;
  }

  public static final int PASSIVE_FIELD_NUMBER = 5;
  private boolean passive_;
  /**
   * <code>bool passive = 5;</code>
   */
  public boolean getPassive() {
    return passive_;
  }

  public static final int PERSISTENT_STORAGE_FIELD_NUMBER = 6;
  private boolean persistentStorage_;
  /**
   * <code>bool persistent_storage = 6;</code>
   */
  public boolean getPersistentStorage() {
    return persistentStorage_;
  }

  public static final int SEGMENT_SIZE_FIELD_NUMBER = 7;
  private int segmentSize_;
  /**
   * <code>int32 segment_size = 7;</code>
   */
  public int getSegmentSize() {
    return segmentSize_;
  }

  public static final int NODES_FIELD_NUMBER = 8;
  private com.google.protobuf.Internal.IntList nodes_;
  /**
   * <code>repeated int32 nodes = 8;</code>
   */
  public java.util.List<java.lang.Integer>
      getNodesList() {
    return nodes_;
  }
  /**
   * <code>repeated int32 nodes = 8;</code>
   */
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   * <code>repeated int32 nodes = 8;</code>
   */
  public int getNodes(int index) {
    return nodes_.getInt(index);
  }
  private int nodesMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (leaderIdSuggestion_ != 0) {
      output.writeInt32(1, leaderIdSuggestion_);
    }
    if (!getStateMachineBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stateMachine_);
    }
    if (electionTimeoutMin_ != 0) {
      output.writeInt32(3, electionTimeoutMin_);
    }
    if (electionTimeoutMax_ != 0) {
      output.writeInt32(4, electionTimeoutMax_);
    }
    if (passive_ != false) {
      output.writeBool(5, passive_);
    }
    if (persistentStorage_ != false) {
      output.writeBool(6, persistentStorage_);
    }
    if (segmentSize_ != 0) {
      output.writeInt32(7, segmentSize_);
    }
    if (getNodesList().size() > 0) {
      output.writeUInt32NoTag(66);
      output.writeUInt32NoTag(nodesMemoizedSerializedSize);
    }
    for (int i = 0; i < nodes_.size(); i++) {
      output.writeInt32NoTag(nodes_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (leaderIdSuggestion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, leaderIdSuggestion_);
    }
    if (!getStateMachineBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stateMachine_);
    }
    if (electionTimeoutMin_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, electionTimeoutMin_);
    }
    if (electionTimeoutMax_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, electionTimeoutMax_);
    }
    if (passive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, passive_);
    }
    if (persistentStorage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, persistentStorage_);
    }
    if (segmentSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, segmentSize_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < nodes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(nodes_.getInt(i));
      }
      size += dataSize;
      if (!getNodesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      nodesMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.github.zomky.transport.protobuf.AddGroupRequest)) {
      return super.equals(obj);
    }
    io.github.zomky.transport.protobuf.AddGroupRequest other = (io.github.zomky.transport.protobuf.AddGroupRequest) obj;

    if (getLeaderIdSuggestion()
        != other.getLeaderIdSuggestion()) return false;
    if (!getStateMachine()
        .equals(other.getStateMachine())) return false;
    if (getElectionTimeoutMin()
        != other.getElectionTimeoutMin()) return false;
    if (getElectionTimeoutMax()
        != other.getElectionTimeoutMax()) return false;
    if (getPassive()
        != other.getPassive()) return false;
    if (getPersistentStorage()
        != other.getPersistentStorage()) return false;
    if (getSegmentSize()
        != other.getSegmentSize()) return false;
    if (!getNodesList()
        .equals(other.getNodesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LEADER_ID_SUGGESTION_FIELD_NUMBER;
    hash = (53 * hash) + getLeaderIdSuggestion();
    hash = (37 * hash) + STATE_MACHINE_FIELD_NUMBER;
    hash = (53 * hash) + getStateMachine().hashCode();
    hash = (37 * hash) + ELECTION_TIMEOUT_MIN_FIELD_NUMBER;
    hash = (53 * hash) + getElectionTimeoutMin();
    hash = (37 * hash) + ELECTION_TIMEOUT_MAX_FIELD_NUMBER;
    hash = (53 * hash) + getElectionTimeoutMax();
    hash = (37 * hash) + PASSIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPassive());
    hash = (37 * hash) + PERSISTENT_STORAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPersistentStorage());
    hash = (37 * hash) + SEGMENT_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSegmentSize();
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.zomky.transport.protobuf.AddGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.github.zomky.transport.protobuf.AddGroupRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AddGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddGroupRequest)
      io.github.zomky.transport.protobuf.AddGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.zomky.transport.protobuf.Raft.internal_static_AddGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.zomky.transport.protobuf.Raft.internal_static_AddGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.zomky.transport.protobuf.AddGroupRequest.class, io.github.zomky.transport.protobuf.AddGroupRequest.Builder.class);
    }

    // Construct using io.github.zomky.transport.protobuf.AddGroupRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      leaderIdSuggestion_ = 0;

      stateMachine_ = "";

      electionTimeoutMin_ = 0;

      electionTimeoutMax_ = 0;

      passive_ = false;

      persistentStorage_ = false;

      segmentSize_ = 0;

      nodes_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.zomky.transport.protobuf.Raft.internal_static_AddGroupRequest_descriptor;
    }

    @java.lang.Override
    public io.github.zomky.transport.protobuf.AddGroupRequest getDefaultInstanceForType() {
      return io.github.zomky.transport.protobuf.AddGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.github.zomky.transport.protobuf.AddGroupRequest build() {
      io.github.zomky.transport.protobuf.AddGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.github.zomky.transport.protobuf.AddGroupRequest buildPartial() {
      io.github.zomky.transport.protobuf.AddGroupRequest result = new io.github.zomky.transport.protobuf.AddGroupRequest(this);
      int from_bitField0_ = bitField0_;
      result.leaderIdSuggestion_ = leaderIdSuggestion_;
      result.stateMachine_ = stateMachine_;
      result.electionTimeoutMin_ = electionTimeoutMin_;
      result.electionTimeoutMax_ = electionTimeoutMax_;
      result.passive_ = passive_;
      result.persistentStorage_ = persistentStorage_;
      result.segmentSize_ = segmentSize_;
      if (((bitField0_ & 0x00000001) != 0)) {
        nodes_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.nodes_ = nodes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.github.zomky.transport.protobuf.AddGroupRequest) {
        return mergeFrom((io.github.zomky.transport.protobuf.AddGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.zomky.transport.protobuf.AddGroupRequest other) {
      if (other == io.github.zomky.transport.protobuf.AddGroupRequest.getDefaultInstance()) return this;
      if (other.getLeaderIdSuggestion() != 0) {
        setLeaderIdSuggestion(other.getLeaderIdSuggestion());
      }
      if (!other.getStateMachine().isEmpty()) {
        stateMachine_ = other.stateMachine_;
        onChanged();
      }
      if (other.getElectionTimeoutMin() != 0) {
        setElectionTimeoutMin(other.getElectionTimeoutMin());
      }
      if (other.getElectionTimeoutMax() != 0) {
        setElectionTimeoutMax(other.getElectionTimeoutMax());
      }
      if (other.getPassive() != false) {
        setPassive(other.getPassive());
      }
      if (other.getPersistentStorage() != false) {
        setPersistentStorage(other.getPersistentStorage());
      }
      if (other.getSegmentSize() != 0) {
        setSegmentSize(other.getSegmentSize());
      }
      if (!other.nodes_.isEmpty()) {
        if (nodes_.isEmpty()) {
          nodes_ = other.nodes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNodesIsMutable();
          nodes_.addAll(other.nodes_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.github.zomky.transport.protobuf.AddGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.zomky.transport.protobuf.AddGroupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int leaderIdSuggestion_ ;
    /**
     * <code>int32 leader_id_suggestion = 1;</code>
     */
    public int getLeaderIdSuggestion() {
      return leaderIdSuggestion_;
    }
    /**
     * <code>int32 leader_id_suggestion = 1;</code>
     */
    public Builder setLeaderIdSuggestion(int value) {
      
      leaderIdSuggestion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 leader_id_suggestion = 1;</code>
     */
    public Builder clearLeaderIdSuggestion() {
      
      leaderIdSuggestion_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stateMachine_ = "";
    /**
     * <code>string state_machine = 2;</code>
     */
    public java.lang.String getStateMachine() {
      java.lang.Object ref = stateMachine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stateMachine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string state_machine = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStateMachineBytes() {
      java.lang.Object ref = stateMachine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stateMachine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string state_machine = 2;</code>
     */
    public Builder setStateMachine(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stateMachine_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string state_machine = 2;</code>
     */
    public Builder clearStateMachine() {
      
      stateMachine_ = getDefaultInstance().getStateMachine();
      onChanged();
      return this;
    }
    /**
     * <code>string state_machine = 2;</code>
     */
    public Builder setStateMachineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stateMachine_ = value;
      onChanged();
      return this;
    }

    private int electionTimeoutMin_ ;
    /**
     * <code>int32 election_timeout_min = 3;</code>
     */
    public int getElectionTimeoutMin() {
      return electionTimeoutMin_;
    }
    /**
     * <code>int32 election_timeout_min = 3;</code>
     */
    public Builder setElectionTimeoutMin(int value) {
      
      electionTimeoutMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 election_timeout_min = 3;</code>
     */
    public Builder clearElectionTimeoutMin() {
      
      electionTimeoutMin_ = 0;
      onChanged();
      return this;
    }

    private int electionTimeoutMax_ ;
    /**
     * <code>int32 election_timeout_max = 4;</code>
     */
    public int getElectionTimeoutMax() {
      return electionTimeoutMax_;
    }
    /**
     * <code>int32 election_timeout_max = 4;</code>
     */
    public Builder setElectionTimeoutMax(int value) {
      
      electionTimeoutMax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 election_timeout_max = 4;</code>
     */
    public Builder clearElectionTimeoutMax() {
      
      electionTimeoutMax_ = 0;
      onChanged();
      return this;
    }

    private boolean passive_ ;
    /**
     * <code>bool passive = 5;</code>
     */
    public boolean getPassive() {
      return passive_;
    }
    /**
     * <code>bool passive = 5;</code>
     */
    public Builder setPassive(boolean value) {
      
      passive_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool passive = 5;</code>
     */
    public Builder clearPassive() {
      
      passive_ = false;
      onChanged();
      return this;
    }

    private boolean persistentStorage_ ;
    /**
     * <code>bool persistent_storage = 6;</code>
     */
    public boolean getPersistentStorage() {
      return persistentStorage_;
    }
    /**
     * <code>bool persistent_storage = 6;</code>
     */
    public Builder setPersistentStorage(boolean value) {
      
      persistentStorage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool persistent_storage = 6;</code>
     */
    public Builder clearPersistentStorage() {
      
      persistentStorage_ = false;
      onChanged();
      return this;
    }

    private int segmentSize_ ;
    /**
     * <code>int32 segment_size = 7;</code>
     */
    public int getSegmentSize() {
      return segmentSize_;
    }
    /**
     * <code>int32 segment_size = 7;</code>
     */
    public Builder setSegmentSize(int value) {
      
      segmentSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 segment_size = 7;</code>
     */
    public Builder clearSegmentSize() {
      
      segmentSize_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList nodes_ = emptyIntList();
    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = mutableCopy(nodes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 nodes = 8;</code>
     */
    public java.util.List<java.lang.Integer>
        getNodesList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(nodes_) : nodes_;
    }
    /**
     * <code>repeated int32 nodes = 8;</code>
     */
    public int getNodesCount() {
      return nodes_.size();
    }
    /**
     * <code>repeated int32 nodes = 8;</code>
     */
    public int getNodes(int index) {
      return nodes_.getInt(index);
    }
    /**
     * <code>repeated int32 nodes = 8;</code>
     */
    public Builder setNodes(
        int index, int value) {
      ensureNodesIsMutable();
      nodes_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nodes = 8;</code>
     */
    public Builder addNodes(int value) {
      ensureNodesIsMutable();
      nodes_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nodes = 8;</code>
     */
    public Builder addAllNodes(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureNodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nodes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nodes = 8;</code>
     */
    public Builder clearNodes() {
      nodes_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AddGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:AddGroupRequest)
  private static final io.github.zomky.transport.protobuf.AddGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.zomky.transport.protobuf.AddGroupRequest();
  }

  public static io.github.zomky.transport.protobuf.AddGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddGroupRequest>() {
    @java.lang.Override
    public AddGroupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddGroupRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.github.zomky.transport.protobuf.AddGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

