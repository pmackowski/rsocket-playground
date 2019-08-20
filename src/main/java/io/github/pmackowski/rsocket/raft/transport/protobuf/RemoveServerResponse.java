// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.pmackowski.rsocket.raft.transport.protobuf;

/**
 * Protobuf type {@code RemoveServerResponse}
 */
public  final class RemoveServerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RemoveServerResponse)
    RemoveServerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveServerResponse.newBuilder() to construct.
  private RemoveServerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveServerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveServerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveServerResponse(
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

            status_ = input.readBool();
            break;
          }
          case 16: {

            leaderHint_ = input.readInt32();
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
    return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_RemoveServerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_RemoveServerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse.class, io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   * <pre>
   * OK if server was removed successfully
   * </pre>
   *
   * <code>bool status = 1;</code>
   */
  public boolean getStatus() {
    return status_;
  }

  public static final int LEADER_HINT_FIELD_NUMBER = 2;
  private int leaderHint_;
  /**
   * <pre>
   * address of recent leader, if known
   * </pre>
   *
   * <code>int32 leader_hint = 2;</code>
   */
  public int getLeaderHint() {
    return leaderHint_;
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
    if (status_ != false) {
      output.writeBool(1, status_);
    }
    if (leaderHint_ != 0) {
      output.writeInt32(2, leaderHint_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, status_);
    }
    if (leaderHint_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, leaderHint_);
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
    if (!(obj instanceof io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse)) {
      return super.equals(obj);
    }
    io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse other = (io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (getLeaderHint()
        != other.getLeaderHint()) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (37 * hash) + LEADER_HINT_FIELD_NUMBER;
    hash = (53 * hash) + getLeaderHint();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parseFrom(
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
  public static Builder newBuilder(io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse prototype) {
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
   * Protobuf type {@code RemoveServerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RemoveServerResponse)
      io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_RemoveServerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_RemoveServerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse.class, io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse.Builder.class);
    }

    // Construct using io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse.newBuilder()
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
      status_ = false;

      leaderHint_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_RemoveServerResponse_descriptor;
    }

    @java.lang.Override
    public io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse getDefaultInstanceForType() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse build() {
      io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse buildPartial() {
      io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse result = new io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse(this);
      result.status_ = status_;
      result.leaderHint_ = leaderHint_;
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
      if (other instanceof io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse) {
        return mergeFrom((io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse other) {
      if (other == io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse.getDefaultInstance()) return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      if (other.getLeaderHint() != 0) {
        setLeaderHint(other.getLeaderHint());
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
      io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean status_ ;
    /**
     * <pre>
     * OK if server was removed successfully
     * </pre>
     *
     * <code>bool status = 1;</code>
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <pre>
     * OK if server was removed successfully
     * </pre>
     *
     * <code>bool status = 1;</code>
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * OK if server was removed successfully
     * </pre>
     *
     * <code>bool status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = false;
      onChanged();
      return this;
    }

    private int leaderHint_ ;
    /**
     * <pre>
     * address of recent leader, if known
     * </pre>
     *
     * <code>int32 leader_hint = 2;</code>
     */
    public int getLeaderHint() {
      return leaderHint_;
    }
    /**
     * <pre>
     * address of recent leader, if known
     * </pre>
     *
     * <code>int32 leader_hint = 2;</code>
     */
    public Builder setLeaderHint(int value) {
      
      leaderHint_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address of recent leader, if known
     * </pre>
     *
     * <code>int32 leader_hint = 2;</code>
     */
    public Builder clearLeaderHint() {
      
      leaderHint_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RemoveServerResponse)
  }

  // @@protoc_insertion_point(class_scope:RemoveServerResponse)
  private static final io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse();
  }

  public static io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveServerResponse>
      PARSER = new com.google.protobuf.AbstractParser<RemoveServerResponse>() {
    @java.lang.Override
    public RemoveServerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveServerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveServerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveServerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.github.pmackowski.rsocket.raft.transport.protobuf.RemoveServerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

