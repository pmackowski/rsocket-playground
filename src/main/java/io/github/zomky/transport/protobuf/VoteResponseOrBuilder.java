// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package io.github.zomky.transport.protobuf;

public interface VoteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VoteResponse)
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
