// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gossip.proto

package io.github.pmackowski.rsocket.raft.gossip.protobuf;

public interface JoinResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:JoinResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool status = 1;</code>
   */
  boolean getStatus();

  /**
   * <code>repeated .Gossip gossips = 2;</code>
   */
  java.util.List<io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip> 
      getGossipsList();
  /**
   * <code>repeated .Gossip gossips = 2;</code>
   */
  io.github.pmackowski.rsocket.raft.gossip.protobuf.Gossip getGossips(int index);
  /**
   * <code>repeated .Gossip gossips = 2;</code>
   */
  int getGossipsCount();
  /**
   * <code>repeated .Gossip gossips = 2;</code>
   */
  java.util.List<? extends io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder> 
      getGossipsOrBuilderList();
  /**
   * <code>repeated .Gossip gossips = 2;</code>
   */
  io.github.pmackowski.rsocket.raft.gossip.protobuf.GossipOrBuilder getGossipsOrBuilder(
      int index);
}
