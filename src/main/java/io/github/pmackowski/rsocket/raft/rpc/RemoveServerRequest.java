// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rpc.proto

package io.github.pmackowski.rsocket.raft.rpc;

/**
 * Protobuf type {@code RemoveServerRequest}
 */
public  final class RemoveServerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RemoveServerRequest)
    RemoveServerRequestOrBuilder {
  // Use RemoveServerRequest.newBuilder() to construct.
  private RemoveServerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveServerRequest() {
    oldServer_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RemoveServerRequest(
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

            oldServer_ = input.readInt32();
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
    return io.github.pmackowski.rsocket.raft.rpc.Rpc.internal_static_RemoveServerRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.pmackowski.rsocket.raft.rpc.Rpc.internal_static_RemoveServerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest.class, io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest.Builder.class);
  }

  public static final int OLDSERVER_FIELD_NUMBER = 1;
  private int oldServer_;
  /**
   * <pre>
   * address of server to remove from configuration
   * </pre>
   *
   * <code>optional int32 oldServer = 1;</code>
   */
  public int getOldServer() {
    return oldServer_;
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
    if (oldServer_ != 0) {
      output.writeInt32(1, oldServer_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oldServer_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, oldServer_);
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
    if (!(obj instanceof io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest)) {
      return super.equals(obj);
    }
    io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest other = (io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest) obj;

    boolean result = true;
    result = result && (getOldServer()
        == other.getOldServer());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + OLDSERVER_FIELD_NUMBER;
    hash = (53 * hash) + getOldServer();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parseFrom(
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
  public static Builder newBuilder(io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest prototype) {
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
   * Protobuf type {@code RemoveServerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RemoveServerRequest)
      io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.pmackowski.rsocket.raft.rpc.Rpc.internal_static_RemoveServerRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.pmackowski.rsocket.raft.rpc.Rpc.internal_static_RemoveServerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest.class, io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest.Builder.class);
    }

    // Construct using io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest.newBuilder()
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
      oldServer_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.pmackowski.rsocket.raft.rpc.Rpc.internal_static_RemoveServerRequest_descriptor;
    }

    public io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest getDefaultInstanceForType() {
      return io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest.getDefaultInstance();
    }

    public io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest build() {
      io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest buildPartial() {
      io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest result = new io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest(this);
      result.oldServer_ = oldServer_;
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
      if (other instanceof io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest) {
        return mergeFrom((io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest other) {
      if (other == io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest.getDefaultInstance()) return this;
      if (other.getOldServer() != 0) {
        setOldServer(other.getOldServer());
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
      io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oldServer_ ;
    /**
     * <pre>
     * address of server to remove from configuration
     * </pre>
     *
     * <code>optional int32 oldServer = 1;</code>
     */
    public int getOldServer() {
      return oldServer_;
    }
    /**
     * <pre>
     * address of server to remove from configuration
     * </pre>
     *
     * <code>optional int32 oldServer = 1;</code>
     */
    public Builder setOldServer(int value) {
      
      oldServer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address of server to remove from configuration
     * </pre>
     *
     * <code>optional int32 oldServer = 1;</code>
     */
    public Builder clearOldServer() {
      
      oldServer_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RemoveServerRequest)
  }

  // @@protoc_insertion_point(class_scope:RemoveServerRequest)
  private static final io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest();
  }

  public static io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveServerRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveServerRequest>() {
    public RemoveServerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveServerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveServerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveServerRequest> getParserForType() {
    return PARSER;
  }

  public io.github.pmackowski.rsocket.raft.rpc.RemoveServerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
