// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package org.github.grpc.examples.helloworld;

public final class HelloWorldProto {

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_sample_SampleRequest_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sample_SampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_sample_SampleReply_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sample_SampleReply_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    String[] descriptorData = {
        "\n\013hello.proto\022\006sample\"\035\n\rSampleRequest\022\014" +
            "\n\004name\030\001 \001(\t\"\036\n\013SampleReply\022\017\n\007message\030\001" +
            " \001(\t2B\n\006Sample\0228\n\010SayHello\022\025.sample.Samp" +
            "leRequest\032\023.sample.SampleReply\"\000B>\n#org." +
            "github.grpc.examples.helloworldB\017HelloWo" +
            "rldProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[]{
            });
    internal_static_sample_SampleRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_sample_SampleRequest_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sample_SampleRequest_descriptor,
        new String[]{"Name",});
    internal_static_sample_SampleReply_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_sample_SampleReply_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sample_SampleReply_descriptor,
        new String[]{"Message",});
  }

  private HelloWorldProto() {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  // @@protoc_insertion_point(outer_class_scope)
}
