// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.pmackowski.rsocket.raft.transport.protobuf;

public interface RemoveServerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RemoveServerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * OK if server was removed successfully
   * </pre>
   *
   * <code>bool status = 1;</code>
   */
  boolean getStatus();

  /**
   * <pre>
   * address of recent leader, if known
   * </pre>
   *
   * <code>int32 leader_hint = 2;</code>
   */
  int getLeaderHint();
}
