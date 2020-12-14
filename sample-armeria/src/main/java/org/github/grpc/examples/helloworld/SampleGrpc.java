package org.github.grpc.examples.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: hello.proto")
public final class SampleGrpc {

  public static final String SERVICE_NAME = "sample.Sample";
  private static final int METHODID_SAY_HELLO = 0;
  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SampleRequest,
      SampleReply> getSayHelloMethod;
  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  private SampleGrpc() {
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = SampleRequest.class,
      responseType = SampleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SampleRequest,
      SampleReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<SampleRequest, SampleReply> getSayHelloMethod;
    if ((getSayHelloMethod = SampleGrpc.getSayHelloMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getSayHelloMethod = SampleGrpc.getSayHelloMethod) == null) {
          SampleGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<SampleRequest, SampleReply>newBuilder()
                  .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                  .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
                  .setSampledToLocalTracing(true)
                  .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                      SampleRequest.getDefaultInstance()))
                  .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                      SampleReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleMethodDescriptorSupplier("SayHello"))
                  .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SampleStub>() {
          @Override
          public SampleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SampleStub(channel, callOptions);
          }
        };
    return SampleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the
   * service
   */
  public static SampleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub>() {
          @Override
          public SampleBlockingStub newStub(io.grpc.Channel channel,
              io.grpc.CallOptions callOptions) {
            return new SampleBlockingStub(channel, callOptions);
          }
        };
    return SampleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub>() {
          @Override
          public SampleFutureStub newStub(io.grpc.Channel channel,
              io.grpc.CallOptions callOptions) {
            return new SampleFutureStub(channel, callOptions);
          }
        };
    return SampleFutureStub.newStub(factory, channel);
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SampleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }

  /**
   *
   */
  public static abstract class SampleImplBase implements io.grpc.BindableService {

    /**
     *
     */
    public void sayHello(SampleRequest request,
        io.grpc.stub.StreamObserver<SampleReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getSayHelloMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      SampleRequest,
                      SampleReply>(
                      this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   *
   */
  public static final class SampleStub extends io.grpc.stub.AbstractAsyncStub<SampleStub> {

    private SampleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SampleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleStub(channel, callOptions);
    }

    /**
     *
     */
    public void sayHello(SampleRequest request,
        io.grpc.stub.StreamObserver<SampleReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   *
   */
  public static final class SampleBlockingStub extends
      io.grpc.stub.AbstractBlockingStub<SampleBlockingStub> {

    private SampleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SampleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleBlockingStub(channel, callOptions);
    }

    /**
     *
     */
    public SampleReply sayHello(
        SampleRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   */
  public static final class SampleFutureStub extends
      io.grpc.stub.AbstractFutureStub<SampleFutureStub> {

    private SampleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SampleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleFutureStub(channel, callOptions);
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<SampleReply> sayHello(
        SampleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

    private final SampleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((SampleRequest) request,
              (io.grpc.stub.StreamObserver<SampleReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
      io.grpc.protobuf.ProtoServiceDescriptorSupplier {

    SampleBaseDescriptorSupplier() {
    }

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HelloWorldProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sample");
    }
  }

  private static final class SampleFileDescriptorSupplier
      extends SampleBaseDescriptorSupplier {

    SampleFileDescriptorSupplier() {
    }
  }

  private static final class SampleMethodDescriptorSupplier
      extends SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

    private final String methodName;

    SampleMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }
}
