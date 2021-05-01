package jt.smartFarmingService2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Service2Climate.proto")
public final class ClimateService2Grpc {

  private ClimateService2Grpc() {}

  public static final String SERVICE_NAME = "service2Climate.ClimateService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<jt.smartFarmingService2.ClimateRequest,
      jt.smartFarmingService2.ClimateResponse> getClimateConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "climateCondition",
      requestType = jt.smartFarmingService2.ClimateRequest.class,
      responseType = jt.smartFarmingService2.ClimateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<jt.smartFarmingService2.ClimateRequest,
      jt.smartFarmingService2.ClimateResponse> getClimateConditionMethod() {
    io.grpc.MethodDescriptor<jt.smartFarmingService2.ClimateRequest, jt.smartFarmingService2.ClimateResponse> getClimateConditionMethod;
    if ((getClimateConditionMethod = ClimateService2Grpc.getClimateConditionMethod) == null) {
      synchronized (ClimateService2Grpc.class) {
        if ((getClimateConditionMethod = ClimateService2Grpc.getClimateConditionMethod) == null) {
          ClimateService2Grpc.getClimateConditionMethod = getClimateConditionMethod = 
              io.grpc.MethodDescriptor.<jt.smartFarmingService2.ClimateRequest, jt.smartFarmingService2.ClimateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2Climate.ClimateService2", "climateCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService2.ClimateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService2.ClimateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClimateService2MethodDescriptorSupplier("climateCondition"))
                  .build();
          }
        }
     }
     return getClimateConditionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClimateService2Stub newStub(io.grpc.Channel channel) {
    return new ClimateService2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClimateService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClimateService2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClimateService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClimateService2FutureStub(channel);
  }

  /**
   */
  public static abstract class ClimateService2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<jt.smartFarmingService2.ClimateRequest> climateCondition(
        io.grpc.stub.StreamObserver<jt.smartFarmingService2.ClimateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getClimateConditionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClimateConditionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                jt.smartFarmingService2.ClimateRequest,
                jt.smartFarmingService2.ClimateResponse>(
                  this, METHODID_CLIMATE_CONDITION)))
          .build();
    }
  }

  /**
   */
  public static final class ClimateService2Stub extends io.grpc.stub.AbstractStub<ClimateService2Stub> {
    private ClimateService2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClimateService2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateService2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClimateService2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<jt.smartFarmingService2.ClimateRequest> climateCondition(
        io.grpc.stub.StreamObserver<jt.smartFarmingService2.ClimateResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getClimateConditionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ClimateService2BlockingStub extends io.grpc.stub.AbstractStub<ClimateService2BlockingStub> {
    private ClimateService2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClimateService2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateService2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClimateService2BlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ClimateService2FutureStub extends io.grpc.stub.AbstractStub<ClimateService2FutureStub> {
    private ClimateService2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClimateService2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateService2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClimateService2FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CLIMATE_CONDITION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClimateService2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClimateService2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIMATE_CONDITION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.climateCondition(
              (io.grpc.stub.StreamObserver<jt.smartFarmingService2.ClimateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClimateService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClimateService2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return jt.smartFarmingService2.Service2ClimateImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClimateService2");
    }
  }

  private static final class ClimateService2FileDescriptorSupplier
      extends ClimateService2BaseDescriptorSupplier {
    ClimateService2FileDescriptorSupplier() {}
  }

  private static final class ClimateService2MethodDescriptorSupplier
      extends ClimateService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClimateService2MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClimateService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClimateService2FileDescriptorSupplier())
              .addMethod(getClimateConditionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
