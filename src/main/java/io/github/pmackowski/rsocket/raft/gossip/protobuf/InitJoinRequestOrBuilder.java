// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gossip.proto

package io.github.pmackowski.rsocket.raft.gossip.protobuf;

public interface InitJoinRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:InitJoinRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 requester_port = 1;</code>
   */
  int getRequesterPort();

  /**
   * <code>optional bool retry = 2;</code>
   */
  boolean getRetry();

  /**
   * <code>optional string host = 3;</code>
   */
  java.lang.String getHost();
  /**
   * <code>optional string host = 3;</code>
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>optional int32 port = 4;</code>
   */
  int getPort();
}
