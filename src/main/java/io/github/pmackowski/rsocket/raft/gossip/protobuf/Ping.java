// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gossip.proto

package io.github.pmackowski.rsocket.raft.gossip.protobuf;

/**
 * Protobuf type {@code Ping}
 */
public  final class Ping extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ping)
    PingOrBuilder {
  // Use Ping.newBuilder() to construct.
  private Ping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Ping() {
    initiatorNodeId_ = 0;
    requestorNodeId_ = 0;
    destinationNodeId_ = 0;
    direct_ = false;
    gossips_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Ping(
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

            initiatorNodeId_ = input.readInt32();
            break;
          }
          case 16: {

            requestorNodeId_ = input.readInt32();
            break;
          }
          case 24: {

            destinationNodeId_ = input.readInt32();
            break;
          }
          case 32: {

            direct_ = input.readBool();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              gossips_ = new java.util.ArrayList<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip>();
              mutable_bitField0_ |= 0x00000010;
            }
            gossips_.add(
                input.readMessage(io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        gossips_ = java.util.Collections.unmodifiableList(gossips_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOuterClass.internal_static_Ping_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOuterClass.internal_static_Ping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping.class, io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping.Builder.class);
  }

  private int bitField0_;
  public static final int INITIATOR_NODE_ID_FIELD_NUMBER = 1;
  private int initiatorNodeId_;
  /**
   * <code>optional int32 initiator_node_id = 1;</code>
   */
  public int getInitiatorNodeId() {
    return initiatorNodeId_;
  }

  public static final int REQUESTOR_NODE_ID_FIELD_NUMBER = 2;
  private int requestorNodeId_;
  /**
   * <code>optional int32 requestor_node_id = 2;</code>
   */
  public int getRequestorNodeId() {
    return requestorNodeId_;
  }

  public static final int DESTINATION_NODE_ID_FIELD_NUMBER = 3;
  private int destinationNodeId_;
  /**
   * <code>optional int32 destination_node_id = 3;</code>
   */
  public int getDestinationNodeId() {
    return destinationNodeId_;
  }

  public static final int DIRECT_FIELD_NUMBER = 4;
  private boolean direct_;
  /**
   * <code>optional bool direct = 4;</code>
   */
  public boolean getDirect() {
    return direct_;
  }

  public static final int GOSSIPS_FIELD_NUMBER = 5;
  private java.util.List<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip> gossips_;
  /**
   * <code>repeated .Gossip gossips = 5;</code>
   */
  public java.util.List<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip> getGossipsList() {
    return gossips_;
  }
  /**
   * <code>repeated .Gossip gossips = 5;</code>
   */
  public java.util.List<? extends io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder> 
      getGossipsOrBuilderList() {
    return gossips_;
  }
  /**
   * <code>repeated .Gossip gossips = 5;</code>
   */
  public int getGossipsCount() {
    return gossips_.size();
  }
  /**
   * <code>repeated .Gossip gossips = 5;</code>
   */
  public io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip getGossips(int index) {
    return gossips_.get(index);
  }
  /**
   * <code>repeated .Gossip gossips = 5;</code>
   */
  public io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder getGossipsOrBuilder(
      int index) {
    return gossips_.get(index);
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
    if (initiatorNodeId_ != 0) {
      output.writeInt32(1, initiatorNodeId_);
    }
    if (requestorNodeId_ != 0) {
      output.writeInt32(2, requestorNodeId_);
    }
    if (destinationNodeId_ != 0) {
      output.writeInt32(3, destinationNodeId_);
    }
    if (direct_ != false) {
      output.writeBool(4, direct_);
    }
    for (int i = 0; i < gossips_.size(); i++) {
      output.writeMessage(5, gossips_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (initiatorNodeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, initiatorNodeId_);
    }
    if (requestorNodeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, requestorNodeId_);
    }
    if (destinationNodeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, destinationNodeId_);
    }
    if (direct_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, direct_);
    }
    for (int i = 0; i < gossips_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, gossips_.get(i));
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
    if (!(obj instanceof io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping)) {
      return super.equals(obj);
    }
    io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping other = (io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping) obj;

    boolean result = true;
    result = result && (getInitiatorNodeId()
        == other.getInitiatorNodeId());
    result = result && (getRequestorNodeId()
        == other.getRequestorNodeId());
    result = result && (getDestinationNodeId()
        == other.getDestinationNodeId());
    result = result && (getDirect()
        == other.getDirect());
    result = result && getGossipsList()
        .equals(other.getGossipsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + INITIATOR_NODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInitiatorNodeId();
    hash = (37 * hash) + REQUESTOR_NODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestorNodeId();
    hash = (37 * hash) + DESTINATION_NODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationNodeId();
    hash = (37 * hash) + DIRECT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDirect());
    if (getGossipsCount() > 0) {
      hash = (37 * hash) + GOSSIPS_FIELD_NUMBER;
      hash = (53 * hash) + getGossipsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parseFrom(
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
  public static Builder newBuilder(io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping prototype) {
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
   * Protobuf type {@code Ping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ping)
      io.github.pmackowski.rsocket.raft.gossip.protobuf.PingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOuterClass.internal_static_Ping_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOuterClass.internal_static_Ping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping.class, io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping.Builder.class);
    }

    // Construct using io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping.newBuilder()
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
        getGossipsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      initiatorNodeId_ = 0;

      requestorNodeId_ = 0;

      destinationNodeId_ = 0;

      direct_ = false;

      if (gossipsBuilder_ == null) {
        gossips_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        gossipsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOuterClass.internal_static_Ping_descriptor;
    }

    public io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping getDefaultInstanceForType() {
      return io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping.getDefaultInstance();
    }

    public io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping build() {
      io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping buildPartial() {
      io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping result = new io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.initiatorNodeId_ = initiatorNodeId_;
      result.requestorNodeId_ = requestorNodeId_;
      result.destinationNodeId_ = destinationNodeId_;
      result.direct_ = direct_;
      if (gossipsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          gossips_ = java.util.Collections.unmodifiableList(gossips_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.gossips_ = gossips_;
      } else {
        result.gossips_ = gossipsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping) {
        return mergeFrom((io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping other) {
      if (other == io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping.getDefaultInstance()) return this;
      if (other.getInitiatorNodeId() != 0) {
        setInitiatorNodeId(other.getInitiatorNodeId());
      }
      if (other.getRequestorNodeId() != 0) {
        setRequestorNodeId(other.getRequestorNodeId());
      }
      if (other.getDestinationNodeId() != 0) {
        setDestinationNodeId(other.getDestinationNodeId());
      }
      if (other.getDirect() != false) {
        setDirect(other.getDirect());
      }
      if (gossipsBuilder_ == null) {
        if (!other.gossips_.isEmpty()) {
          if (gossips_.isEmpty()) {
            gossips_ = other.gossips_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureGossipsIsMutable();
            gossips_.addAll(other.gossips_);
          }
          onChanged();
        }
      } else {
        if (!other.gossips_.isEmpty()) {
          if (gossipsBuilder_.isEmpty()) {
            gossipsBuilder_.dispose();
            gossipsBuilder_ = null;
            gossips_ = other.gossips_;
            bitField0_ = (bitField0_ & ~0x00000010);
            gossipsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGossipsFieldBuilder() : null;
          } else {
            gossipsBuilder_.addAllMessages(other.gossips_);
          }
        }
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
      io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int initiatorNodeId_ ;
    /**
     * <code>optional int32 initiator_node_id = 1;</code>
     */
    public int getInitiatorNodeId() {
      return initiatorNodeId_;
    }
    /**
     * <code>optional int32 initiator_node_id = 1;</code>
     */
    public Builder setInitiatorNodeId(int value) {
      
      initiatorNodeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 initiator_node_id = 1;</code>
     */
    public Builder clearInitiatorNodeId() {
      
      initiatorNodeId_ = 0;
      onChanged();
      return this;
    }

    private int requestorNodeId_ ;
    /**
     * <code>optional int32 requestor_node_id = 2;</code>
     */
    public int getRequestorNodeId() {
      return requestorNodeId_;
    }
    /**
     * <code>optional int32 requestor_node_id = 2;</code>
     */
    public Builder setRequestorNodeId(int value) {
      
      requestorNodeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 requestor_node_id = 2;</code>
     */
    public Builder clearRequestorNodeId() {
      
      requestorNodeId_ = 0;
      onChanged();
      return this;
    }

    private int destinationNodeId_ ;
    /**
     * <code>optional int32 destination_node_id = 3;</code>
     */
    public int getDestinationNodeId() {
      return destinationNodeId_;
    }
    /**
     * <code>optional int32 destination_node_id = 3;</code>
     */
    public Builder setDestinationNodeId(int value) {
      
      destinationNodeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 destination_node_id = 3;</code>
     */
    public Builder clearDestinationNodeId() {
      
      destinationNodeId_ = 0;
      onChanged();
      return this;
    }

    private boolean direct_ ;
    /**
     * <code>optional bool direct = 4;</code>
     */
    public boolean getDirect() {
      return direct_;
    }
    /**
     * <code>optional bool direct = 4;</code>
     */
    public Builder setDirect(boolean value) {
      
      direct_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool direct = 4;</code>
     */
    public Builder clearDirect() {
      
      direct_ = false;
      onChanged();
      return this;
    }

    private java.util.List<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip> gossips_ =
      java.util.Collections.emptyList();
    private void ensureGossipsIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        gossips_ = new java.util.ArrayList<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip>(gossips_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder, io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder> gossipsBuilder_;

    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public java.util.List<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip> getGossipsList() {
      if (gossipsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(gossips_);
      } else {
        return gossipsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public int getGossipsCount() {
      if (gossipsBuilder_ == null) {
        return gossips_.size();
      } else {
        return gossipsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip getGossips(int index) {
      if (gossipsBuilder_ == null) {
        return gossips_.get(index);
      } else {
        return gossipsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder setGossips(
        int index, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip value) {
      if (gossipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGossipsIsMutable();
        gossips_.set(index, value);
        onChanged();
      } else {
        gossipsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder setGossips(
        int index, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder builderForValue) {
      if (gossipsBuilder_ == null) {
        ensureGossipsIsMutable();
        gossips_.set(index, builderForValue.build());
        onChanged();
      } else {
        gossipsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder addGossips(io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip value) {
      if (gossipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGossipsIsMutable();
        gossips_.add(value);
        onChanged();
      } else {
        gossipsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder addGossips(
        int index, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip value) {
      if (gossipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGossipsIsMutable();
        gossips_.add(index, value);
        onChanged();
      } else {
        gossipsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder addGossips(
        io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder builderForValue) {
      if (gossipsBuilder_ == null) {
        ensureGossipsIsMutable();
        gossips_.add(builderForValue.build());
        onChanged();
      } else {
        gossipsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder addGossips(
        int index, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder builderForValue) {
      if (gossipsBuilder_ == null) {
        ensureGossipsIsMutable();
        gossips_.add(index, builderForValue.build());
        onChanged();
      } else {
        gossipsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder addAllGossips(
        java.lang.Iterable<? extends io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip> values) {
      if (gossipsBuilder_ == null) {
        ensureGossipsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gossips_);
        onChanged();
      } else {
        gossipsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder clearGossips() {
      if (gossipsBuilder_ == null) {
        gossips_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        gossipsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public Builder removeGossips(int index) {
      if (gossipsBuilder_ == null) {
        ensureGossipsIsMutable();
        gossips_.remove(index);
        onChanged();
      } else {
        gossipsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder getGossipsBuilder(
        int index) {
      return getGossipsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder getGossipsOrBuilder(
        int index) {
      if (gossipsBuilder_ == null) {
        return gossips_.get(index);  } else {
        return gossipsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public java.util.List<? extends io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder> 
         getGossipsOrBuilderList() {
      if (gossipsBuilder_ != null) {
        return gossipsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(gossips_);
      }
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder addGossipsBuilder() {
      return getGossipsFieldBuilder().addBuilder(
          io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.getDefaultInstance());
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder addGossipsBuilder(
        int index) {
      return getGossipsFieldBuilder().addBuilder(
          index, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.getDefaultInstance());
    }
    /**
     * <code>repeated .Gossip gossips = 5;</code>
     */
    public java.util.List<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder> 
         getGossipsBuilderList() {
      return getGossipsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder, io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder> 
        getGossipsFieldBuilder() {
      if (gossipsBuilder_ == null) {
        gossipsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip, io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip.Builder, io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder>(
                gossips_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        gossips_ = null;
      }
      return gossipsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Ping)
  }

  // @@protoc_insertion_point(class_scope:Ping)
  private static final io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping();
  }

  public static io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Ping>
      PARSER = new com.google.protobuf.AbstractParser<Ping>() {
    public Ping parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Ping(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Ping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Ping> getParserForType() {
    return PARSER;
  }

  public io.github.pmackowski.rsocket.raft.gossip.protobuf.Ping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

