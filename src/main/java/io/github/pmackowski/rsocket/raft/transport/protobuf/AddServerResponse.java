// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.pmackowski.rsocket.raft.transport.protobuf;

/**
 * Protobuf type {@code AddServerResponse}
 */
public  final class AddServerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddServerResponse)
    AddServerResponseOrBuilder {
  // Use AddServerResponse.newBuilder() to construct.
  private AddServerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddServerResponse() {
    status_ = false;
    leaderHint_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AddServerResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            status_ = input.readBool();
            break;
          }
          case 16: {

            leaderHint_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_AddServerResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_AddServerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse.class, io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   * <pre>
   * OK if server was added successfully
   * </pre>
   *
   * <code>optional bool status = 1;</code>
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
   * <code>optional int32 leader_hint = 2;</code>
   */
  public int getLeaderHint() {
    return leaderHint_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != false) {
      output.writeBool(1, status_);
    }
    if (leaderHint_ != 0) {
      output.writeInt32(2, leaderHint_);
    }
  }

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
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse)) {
      return super.equals(obj);
    }
    io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse other = (io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse) obj;

    boolean result = true;
    result = result && (getStatus()
        == other.getStatus());
    result = result && (getLeaderHint()
        == other.getLeaderHint());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (37 * hash) + LEADER_HINT_FIELD_NUMBER;
    hash = (53 * hash) + getLeaderHint();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code AddServerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddServerResponse)
      io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_AddServerResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_AddServerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse.class, io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse.Builder.class);
    }

    // Construct using io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      status_ = false;

      leaderHint_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.Raft.internal_static_AddServerResponse_descriptor;
    }

    public io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse getDefaultInstanceForType() {
      return io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse.getDefaultInstance();
    }

    public io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse build() {
      io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse buildPartial() {
      io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse result = new io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse(this);
      result.status_ = status_;
      result.leaderHint_ = leaderHint_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse) {
        return mergeFrom((io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse other) {
      if (other == io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse.getDefaultInstance()) return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      if (other.getLeaderHint() != 0) {
        setLeaderHint(other.getLeaderHint());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse) e.getUnfinishedMessage();
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
     * OK if server was added successfully
     * </pre>
     *
     * <code>optional bool status = 1;</code>
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <pre>
     * OK if server was added successfully
     * </pre>
     *
     * <code>optional bool status = 1;</code>
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * OK if server was added successfully
     * </pre>
     *
     * <code>optional bool status = 1;</code>
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
     * <code>optional int32 leader_hint = 2;</code>
     */
    public int getLeaderHint() {
      return leaderHint_;
    }
    /**
     * <pre>
     * address of recent leader, if known
     * </pre>
     *
     * <code>optional int32 leader_hint = 2;</code>
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
     * <code>optional int32 leader_hint = 2;</code>
     */
    public Builder clearLeaderHint() {
      
      leaderHint_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:AddServerResponse)
  }

  // @@protoc_insertion_point(class_scope:AddServerResponse)
  private static final io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse();
  }

  public static io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddServerResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddServerResponse>() {
    public AddServerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddServerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddServerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddServerResponse> getParserForType() {
    return PARSER;
  }

  public io.github.pmackowski.rsocket.raft.transport.protobuf.AddServerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

