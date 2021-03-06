// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gossip.proto

package io.github.zomky.gossip.protobuf;

public final class GossipOuterClass {
  private GossipOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InitJoinRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InitJoinRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InitJoinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InitJoinResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JoinRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JoinRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JoinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JoinResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InitLeaveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InitLeaveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InitLeaveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InitLeaveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LeaveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LeaveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LeaveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LeaveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Gossip_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Gossip_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Ack_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Ack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014gossip.proto\"T\n\017InitJoinRequest\022\026\n\016req" +
      "uester_port\030\001 \001(\005\022\r\n\005retry\030\002 \001(\010\022\014\n\004host" +
      "\030\003 \001(\t\022\014\n\004port\030\004 \001(\005\"\"\n\020InitJoinResponse" +
      "\022\016\n\006status\030\001 \001(\010\"[\n\013JoinRequest\022\026\n\016reque" +
      "ster_port\030\001 \001(\005\022\014\n\004host\030\002 \001(\t\022\014\n\004port\030\003 " +
      "\001(\005\022\030\n\007gossips\030\004 \003(\0132\007.Gossip\"8\n\014JoinRes" +
      "ponse\022\016\n\006status\030\001 \001(\010\022\030\n\007gossips\030\002 \003(\0132\007" +
      ".Gossip\"*\n\020InitLeaveRequest\022\026\n\016requester" +
      "_port\030\001 \001(\005\"#\n\021InitLeaveResponse\022\016\n\006stat" +
      "us\030\001 \001(\010\"&\n\014LeaveRequest\022\026\n\016requester_po" +
      "rt\030\001 \001(\005\"\037\n\rLeaveResponse\022\016\n\006status\030\001 \001(" +
      "\010\"\263\001\n\006Gossip\022$\n\tsuspicion\030\001 \001(\0162\021.Gossip" +
      ".Suspicion\022\023\n\013incarnation\030\002 \001(\005\022\017\n\007node_" +
      "id\030\003 \001(\005\022!\n\031node_id_harbour_suspicion\030\004 " +
      "\001(\005\":\n\tSuspicion\022\013\n\007UNKNOWN\020\000\022\t\n\005ALIVE\020\001" +
      "\022\013\n\007SUSPECT\020\002\022\010\n\004DEAD\020\003\"\252\001\n\004Ping\022\031\n\021init" +
      "iator_node_id\030\001 \001(\005\022\031\n\021requestor_node_id" +
      "\030\002 \001(\005\022\033\n\023destination_node_id\030\003 \001(\005\022\016\n\006d" +
      "irect\030\004 \001(\010\022\017\n\007counter\030\005 \001(\003\022\024\n\014nack_tim" +
      "eout\030\006 \001(\005\022\030\n\007gossips\030\007 \003(\0132\007.Gossip\"K\n\003" +
      "Ack\022\017\n\007node_id\030\001 \001(\005\022\014\n\004nack\030\002 \001(\010\022\013\n\003tc" +
      "p\030\003 \001(\010\022\030\n\007gossips\030\004 \003(\0132\007.GossipB#\n\037io." +
      "github.zomky.gossip.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InitJoinRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InitJoinRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InitJoinRequest_descriptor,
        new java.lang.String[] { "RequesterPort", "Retry", "Host", "Port", });
    internal_static_InitJoinResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_InitJoinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InitJoinResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_JoinRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_JoinRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JoinRequest_descriptor,
        new java.lang.String[] { "RequesterPort", "Host", "Port", "Gossips", });
    internal_static_JoinResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_JoinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JoinResponse_descriptor,
        new java.lang.String[] { "Status", "Gossips", });
    internal_static_InitLeaveRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_InitLeaveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InitLeaveRequest_descriptor,
        new java.lang.String[] { "RequesterPort", });
    internal_static_InitLeaveResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_InitLeaveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InitLeaveResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_LeaveRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_LeaveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LeaveRequest_descriptor,
        new java.lang.String[] { "RequesterPort", });
    internal_static_LeaveResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_LeaveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LeaveResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_Gossip_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Gossip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Gossip_descriptor,
        new java.lang.String[] { "Suspicion", "Incarnation", "NodeId", "NodeIdHarbourSuspicion", });
    internal_static_Ping_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ping_descriptor,
        new java.lang.String[] { "InitiatorNodeId", "RequestorNodeId", "DestinationNodeId", "Direct", "Counter", "NackTimeout", "Gossips", });
    internal_static_Ack_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Ack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Ack_descriptor,
        new java.lang.String[] { "NodeId", "Nack", "Tcp", "Gossips", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
