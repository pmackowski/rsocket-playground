// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.pmackowski.rsocket.raft.transport.protobuf;

public interface PreVoteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PreVoteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 term = 1;</code>
   */
  int getTerm();

  /**
   * <code>bool vote_granted = 2;</code>
   */
  boolean getVoteGranted();
}
