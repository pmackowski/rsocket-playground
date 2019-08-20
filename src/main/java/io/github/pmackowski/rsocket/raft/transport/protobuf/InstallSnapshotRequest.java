// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.pmackowski.rsocket.raft.transport.protobuf;

/**
 * Protobuf type {@code InstallSnapshotRequest}
 */
public  final class InstallSnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:InstallSnapshotRequest)
    InstallSnapshotRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstallSnapshotRequest.newBuilder() to construct.
  private InstallSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstallSnapshotRequest() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstallSnapshotRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstallSnapshotRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            term_ = input.readInt32();
            break;
          }
          case 16: {

            leaderId_ = input.readInt32();
            break;
          }
          case 24: {

            lastIncludedIndex_ = input.readInt64();
            break;
          }
          case 32: {

            lastIncludedTerm_ = input.readInt64();
            break;
          }
          case 42: {

            data_ = input.readBytes();
            break;
          }
          case 48: {

            done_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_InstallSnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_InstallSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest.class, io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private int term_;
  /**
   * <pre>
   * leader’s term
   * </pre>
   *
   * <code>int32 term = 1;</code>
   */
  public int getTerm() {
    return term_;
  }

  public static final int LEADER_ID_FIELD_NUMBER = 2;
  private int leaderId_;
  /**
   * <pre>
   * so follower can redirect clients
   * </pre>
   *
   * <code>int32 leader_id = 2;</code>
   */
  public int getLeaderId() {
    return leaderId_;
  }

  public static final int LAST_INCLUDED_INDEX_FIELD_NUMBER = 3;
  private long lastIncludedIndex_;
  /**
   * <pre>
   * the snapshot replaces all entries up through and including this index
   * </pre>
   *
   * <code>int64 last_included_index = 3;</code>
   */
  public long getLastIncludedIndex() {
    return lastIncludedIndex_;
  }

  public static final int LAST_INCLUDED_TERM_FIELD_NUMBER = 4;
  private long lastIncludedTerm_;
  /**
   * <pre>
   * lastIncludedTerm term of lastIncludedIndex offset byte offset where chunk is positioned in the snapshot file
   * </pre>
   *
   * <code>int64 last_included_term = 4;</code>
   */
  public long getLastIncludedTerm() {
    return lastIncludedTerm_;
  }

  public static final int DATA_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * raw bytes of the snapshot chunk, starting at offset
   * </pre>
   *
   * <code>bytes data = 5;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int DONE_FIELD_NUMBER = 6;
  private boolean done_;
  /**
   * <pre>
   * true if this is the last chunk
   * </pre>
   *
   * <code>bool done = 6;</code>
   */
  public boolean getDone() {
    return done_;
  }

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
    if (term_ != 0) {
      output.writeInt32(1, term_);
    }
    if (leaderId_ != 0) {
      output.writeInt32(2, leaderId_);
    }
    if (lastIncludedIndex_ != 0L) {
      output.writeInt64(3, lastIncludedIndex_);
    }
    if (lastIncludedTerm_ != 0L) {
      output.writeInt64(4, lastIncludedTerm_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(5, data_);
    }
    if (done_ != false) {
      output.writeBool(6, done_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (term_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, term_);
    }
    if (leaderId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, leaderId_);
    }
    if (lastIncludedIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lastIncludedIndex_);
    }
    if (lastIncludedTerm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lastIncludedTerm_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, data_);
    }
    if (done_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, done_);
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
    if (!(obj instanceof io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest)) {
      return super.equals(obj);
    }
    io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest other = (io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest) obj;

    if (getTerm()
        != other.getTerm()) return false;
    if (getLeaderId()
        != other.getLeaderId()) return false;
    if (getLastIncludedIndex()
        != other.getLastIncludedIndex()) return false;
    if (getLastIncludedTerm()
        != other.getLastIncludedTerm()) return false;
    if (!getData()
        .equals(other.getData())) return false;
    if (getDone()
        != other.getDone()) return false;
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
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm();
    hash = (37 * hash) + LEADER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLeaderId();
    hash = (37 * hash) + LAST_INCLUDED_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastIncludedIndex());
    hash = (37 * hash) + LAST_INCLUDED_TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastIncludedTerm());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + DONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDone());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parseFrom(
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
  public static Builder newBuilder(io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest prototype) {
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
   * Protobuf type {@code InstallSnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InstallSnapshotRequest)
      io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_InstallSnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_InstallSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest.class, io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest.Builder.class);
    }

    // Construct using io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest.newBuilder()
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
      term_ = 0;

      leaderId_ = 0;

      lastIncludedIndex_ = 0L;

      lastIncludedTerm_ = 0L;

      data_ = com.google.protobuf.ByteString.EMPTY;

      done_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_InstallSnapshotRequest_descriptor;
    }

    @java.lang.Override
    public io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest getDefaultInstanceForType() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest build() {
      io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest buildPartial() {
      io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest result = new io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest(this);
      result.term_ = term_;
      result.leaderId_ = leaderId_;
      result.lastIncludedIndex_ = lastIncludedIndex_;
      result.lastIncludedTerm_ = lastIncludedTerm_;
      result.data_ = data_;
      result.done_ = done_;
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
      if (other instanceof io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest) {
        return mergeFrom((io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest other) {
      if (other == io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest.getDefaultInstance()) return this;
      if (other.getTerm() != 0) {
        setTerm(other.getTerm());
      }
      if (other.getLeaderId() != 0) {
        setLeaderId(other.getLeaderId());
      }
      if (other.getLastIncludedIndex() != 0L) {
        setLastIncludedIndex(other.getLastIncludedIndex());
      }
      if (other.getLastIncludedTerm() != 0L) {
        setLastIncludedTerm(other.getLastIncludedTerm());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.getDone() != false) {
        setDone(other.getDone());
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
      io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int term_ ;
    /**
     * <pre>
     * leader’s term
     * </pre>
     *
     * <code>int32 term = 1;</code>
     */
    public int getTerm() {
      return term_;
    }
    /**
     * <pre>
     * leader’s term
     * </pre>
     *
     * <code>int32 term = 1;</code>
     */
    public Builder setTerm(int value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * leader’s term
     * </pre>
     *
     * <code>int32 term = 1;</code>
     */
    public Builder clearTerm() {
      
      term_ = 0;
      onChanged();
      return this;
    }

    private int leaderId_ ;
    /**
     * <pre>
     * so follower can redirect clients
     * </pre>
     *
     * <code>int32 leader_id = 2;</code>
     */
    public int getLeaderId() {
      return leaderId_;
    }
    /**
     * <pre>
     * so follower can redirect clients
     * </pre>
     *
     * <code>int32 leader_id = 2;</code>
     */
    public Builder setLeaderId(int value) {
      
      leaderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * so follower can redirect clients
     * </pre>
     *
     * <code>int32 leader_id = 2;</code>
     */
    public Builder clearLeaderId() {
      
      leaderId_ = 0;
      onChanged();
      return this;
    }

    private long lastIncludedIndex_ ;
    /**
     * <pre>
     * the snapshot replaces all entries up through and including this index
     * </pre>
     *
     * <code>int64 last_included_index = 3;</code>
     */
    public long getLastIncludedIndex() {
      return lastIncludedIndex_;
    }
    /**
     * <pre>
     * the snapshot replaces all entries up through and including this index
     * </pre>
     *
     * <code>int64 last_included_index = 3;</code>
     */
    public Builder setLastIncludedIndex(long value) {
      
      lastIncludedIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the snapshot replaces all entries up through and including this index
     * </pre>
     *
     * <code>int64 last_included_index = 3;</code>
     */
    public Builder clearLastIncludedIndex() {
      
      lastIncludedIndex_ = 0L;
      onChanged();
      return this;
    }

    private long lastIncludedTerm_ ;
    /**
     * <pre>
     * lastIncludedTerm term of lastIncludedIndex offset byte offset where chunk is positioned in the snapshot file
     * </pre>
     *
     * <code>int64 last_included_term = 4;</code>
     */
    public long getLastIncludedTerm() {
      return lastIncludedTerm_;
    }
    /**
     * <pre>
     * lastIncludedTerm term of lastIncludedIndex offset byte offset where chunk is positioned in the snapshot file
     * </pre>
     *
     * <code>int64 last_included_term = 4;</code>
     */
    public Builder setLastIncludedTerm(long value) {
      
      lastIncludedTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * lastIncludedTerm term of lastIncludedIndex offset byte offset where chunk is positioned in the snapshot file
     * </pre>
     *
     * <code>int64 last_included_term = 4;</code>
     */
    public Builder clearLastIncludedTerm() {
      
      lastIncludedTerm_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * raw bytes of the snapshot chunk, starting at offset
     * </pre>
     *
     * <code>bytes data = 5;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * raw bytes of the snapshot chunk, starting at offset
     * </pre>
     *
     * <code>bytes data = 5;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * raw bytes of the snapshot chunk, starting at offset
     * </pre>
     *
     * <code>bytes data = 5;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private boolean done_ ;
    /**
     * <pre>
     * true if this is the last chunk
     * </pre>
     *
     * <code>bool done = 6;</code>
     */
    public boolean getDone() {
      return done_;
    }
    /**
     * <pre>
     * true if this is the last chunk
     * </pre>
     *
     * <code>bool done = 6;</code>
     */
    public Builder setDone(boolean value) {
      
      done_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * true if this is the last chunk
     * </pre>
     *
     * <code>bool done = 6;</code>
     */
    public Builder clearDone() {
      
      done_ = false;
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


    // @@protoc_insertion_point(builder_scope:InstallSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:InstallSnapshotRequest)
  private static final io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest();
  }

  public static io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstallSnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<InstallSnapshotRequest>() {
    @java.lang.Override
    public InstallSnapshotRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstallSnapshotRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstallSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstallSnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.github.pmackowski.rsocket.raft.transport.protobuf.InstallSnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

