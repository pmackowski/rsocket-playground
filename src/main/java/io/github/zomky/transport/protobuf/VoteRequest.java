// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.zomky.transport.protobuf;

/**
 * Protobuf type {@code VoteRequest}
 */
public  final class VoteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VoteRequest)
    VoteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteRequest.newBuilder() to construct.
  private VoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VoteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoteRequest(
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

            candidateId_ = input.readInt32();
            break;
          }
          case 24: {

            lastLogIndex_ = input.readInt64();
            break;
          }
          case 32: {

            lastLogTerm_ = input.readInt64();
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
    return io.github.zomky.transport.protobuf.Raft.internal_static_VoteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.zomky.transport.protobuf.Raft.internal_static_VoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.zomky.transport.protobuf.VoteRequest.class, io.github.zomky.transport.protobuf.VoteRequest.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private int term_;
  /**
   * <pre>
   * candidate’s term
   * </pre>
   *
   * <code>int32 term = 1;</code>
   */
  public int getTerm() {
    return term_;
  }

  public static final int CANDIDATE_ID_FIELD_NUMBER = 2;
  private int candidateId_;
  /**
   * <pre>
   * candidate requesting vote
   * </pre>
   *
   * <code>int32 candidate_id = 2;</code>
   */
  public int getCandidateId() {
    return candidateId_;
  }

  public static final int LAST_LOG_INDEX_FIELD_NUMBER = 3;
  private long lastLogIndex_;
  /**
   * <pre>
   * index of candidate’s last log entry
   * </pre>
   *
   * <code>int64 last_log_index = 3;</code>
   */
  public long getLastLogIndex() {
    return lastLogIndex_;
  }

  public static final int LAST_LOG_TERM_FIELD_NUMBER = 4;
  private long lastLogTerm_;
  /**
   * <pre>
   * term of candidate’s last log entry
   * </pre>
   *
   * <code>int64 last_log_term = 4;</code>
   */
  public long getLastLogTerm() {
    return lastLogTerm_;
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
    if (candidateId_ != 0) {
      output.writeInt32(2, candidateId_);
    }
    if (lastLogIndex_ != 0L) {
      output.writeInt64(3, lastLogIndex_);
    }
    if (lastLogTerm_ != 0L) {
      output.writeInt64(4, lastLogTerm_);
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
    if (candidateId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, candidateId_);
    }
    if (lastLogIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lastLogIndex_);
    }
    if (lastLogTerm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lastLogTerm_);
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
    if (!(obj instanceof io.github.zomky.transport.protobuf.VoteRequest)) {
      return super.equals(obj);
    }
    io.github.zomky.transport.protobuf.VoteRequest other = (io.github.zomky.transport.protobuf.VoteRequest) obj;

    if (getTerm()
        != other.getTerm()) return false;
    if (getCandidateId()
        != other.getCandidateId()) return false;
    if (getLastLogIndex()
        != other.getLastLogIndex()) return false;
    if (getLastLogTerm()
        != other.getLastLogTerm()) return false;
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
    hash = (37 * hash) + CANDIDATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCandidateId();
    hash = (37 * hash) + LAST_LOG_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastLogIndex());
    hash = (37 * hash) + LAST_LOG_TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastLogTerm());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.zomky.transport.protobuf.VoteRequest parseFrom(
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
  public static Builder newBuilder(io.github.zomky.transport.protobuf.VoteRequest prototype) {
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
   * Protobuf type {@code VoteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VoteRequest)
      io.github.zomky.transport.protobuf.VoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.zomky.transport.protobuf.Raft.internal_static_VoteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.zomky.transport.protobuf.Raft.internal_static_VoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.zomky.transport.protobuf.VoteRequest.class, io.github.zomky.transport.protobuf.VoteRequest.Builder.class);
    }

    // Construct using io.github.zomky.transport.protobuf.VoteRequest.newBuilder()
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

      candidateId_ = 0;

      lastLogIndex_ = 0L;

      lastLogTerm_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.zomky.transport.protobuf.Raft.internal_static_VoteRequest_descriptor;
    }

    @java.lang.Override
    public io.github.zomky.transport.protobuf.VoteRequest getDefaultInstanceForType() {
      return io.github.zomky.transport.protobuf.VoteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.github.zomky.transport.protobuf.VoteRequest build() {
      io.github.zomky.transport.protobuf.VoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.github.zomky.transport.protobuf.VoteRequest buildPartial() {
      io.github.zomky.transport.protobuf.VoteRequest result = new io.github.zomky.transport.protobuf.VoteRequest(this);
      result.term_ = term_;
      result.candidateId_ = candidateId_;
      result.lastLogIndex_ = lastLogIndex_;
      result.lastLogTerm_ = lastLogTerm_;
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
      if (other instanceof io.github.zomky.transport.protobuf.VoteRequest) {
        return mergeFrom((io.github.zomky.transport.protobuf.VoteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.zomky.transport.protobuf.VoteRequest other) {
      if (other == io.github.zomky.transport.protobuf.VoteRequest.getDefaultInstance()) return this;
      if (other.getTerm() != 0) {
        setTerm(other.getTerm());
      }
      if (other.getCandidateId() != 0) {
        setCandidateId(other.getCandidateId());
      }
      if (other.getLastLogIndex() != 0L) {
        setLastLogIndex(other.getLastLogIndex());
      }
      if (other.getLastLogTerm() != 0L) {
        setLastLogTerm(other.getLastLogTerm());
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
      io.github.zomky.transport.protobuf.VoteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.zomky.transport.protobuf.VoteRequest) e.getUnfinishedMessage();
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
     * candidate’s term
     * </pre>
     *
     * <code>int32 term = 1;</code>
     */
    public int getTerm() {
      return term_;
    }
    /**
     * <pre>
     * candidate’s term
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
     * candidate’s term
     * </pre>
     *
     * <code>int32 term = 1;</code>
     */
    public Builder clearTerm() {
      
      term_ = 0;
      onChanged();
      return this;
    }

    private int candidateId_ ;
    /**
     * <pre>
     * candidate requesting vote
     * </pre>
     *
     * <code>int32 candidate_id = 2;</code>
     */
    public int getCandidateId() {
      return candidateId_;
    }
    /**
     * <pre>
     * candidate requesting vote
     * </pre>
     *
     * <code>int32 candidate_id = 2;</code>
     */
    public Builder setCandidateId(int value) {
      
      candidateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * candidate requesting vote
     * </pre>
     *
     * <code>int32 candidate_id = 2;</code>
     */
    public Builder clearCandidateId() {
      
      candidateId_ = 0;
      onChanged();
      return this;
    }

    private long lastLogIndex_ ;
    /**
     * <pre>
     * index of candidate’s last log entry
     * </pre>
     *
     * <code>int64 last_log_index = 3;</code>
     */
    public long getLastLogIndex() {
      return lastLogIndex_;
    }
    /**
     * <pre>
     * index of candidate’s last log entry
     * </pre>
     *
     * <code>int64 last_log_index = 3;</code>
     */
    public Builder setLastLogIndex(long value) {
      
      lastLogIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * index of candidate’s last log entry
     * </pre>
     *
     * <code>int64 last_log_index = 3;</code>
     */
    public Builder clearLastLogIndex() {
      
      lastLogIndex_ = 0L;
      onChanged();
      return this;
    }

    private long lastLogTerm_ ;
    /**
     * <pre>
     * term of candidate’s last log entry
     * </pre>
     *
     * <code>int64 last_log_term = 4;</code>
     */
    public long getLastLogTerm() {
      return lastLogTerm_;
    }
    /**
     * <pre>
     * term of candidate’s last log entry
     * </pre>
     *
     * <code>int64 last_log_term = 4;</code>
     */
    public Builder setLastLogTerm(long value) {
      
      lastLogTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * term of candidate’s last log entry
     * </pre>
     *
     * <code>int64 last_log_term = 4;</code>
     */
    public Builder clearLastLogTerm() {
      
      lastLogTerm_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:VoteRequest)
  }

  // @@protoc_insertion_point(class_scope:VoteRequest)
  private static final io.github.zomky.transport.protobuf.VoteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.zomky.transport.protobuf.VoteRequest();
  }

  public static io.github.zomky.transport.protobuf.VoteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteRequest>
      PARSER = new com.google.protobuf.AbstractParser<VoteRequest>() {
    @java.lang.Override
    public VoteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.github.zomky.transport.protobuf.VoteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

