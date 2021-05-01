package jt.smartFarmingService1;

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
    comments = "Source: Service1Livestock.proto")
public final class LiveStockService1Grpc {

  private LiveStockService1Grpc() {}

  public static final String SERVICE_NAME = "service1LiveStock.LiveStockService1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<jt.smartFarmingService1.HeartRateRequest,
      jt.smartFarmingService1.HeartRateResponse> getGetHeartRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeartRate",
      requestType = jt.smartFarmingService1.HeartRateRequest.class,
      responseType = jt.smartFarmingService1.HeartRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jt.smartFarmingService1.HeartRateRequest,
      jt.smartFarmingService1.HeartRateResponse> getGetHeartRateMethod() {
    io.grpc.MethodDescriptor<jt.smartFarmingService1.HeartRateRequest, jt.smartFarmingService1.HeartRateResponse> getGetHeartRateMethod;
    if ((getGetHeartRateMethod = LiveStockService1Grpc.getGetHeartRateMethod) == null) {
      synchronized (LiveStockService1Grpc.class) {
        if ((getGetHeartRateMethod = LiveStockService1Grpc.getGetHeartRateMethod) == null) {
          LiveStockService1Grpc.getGetHeartRateMethod = getGetHeartRateMethod = 
              io.grpc.MethodDescriptor.<jt.smartFarmingService1.HeartRateRequest, jt.smartFarmingService1.HeartRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1LiveStock.LiveStockService1", "getHeartRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService1.HeartRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService1.HeartRateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockService1MethodDescriptorSupplier("getHeartRate"))
                  .build();
          }
        }
     }
     return getGetHeartRateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LiveStockService1Stub newStub(io.grpc.Channel channel) {
    return new LiveStockService1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LiveStockService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LiveStockService1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LiveStockService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LiveStockService1FutureStub(channel);
  }

  /**
   */
  public static abstract class LiveStockService1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getHeartRate(jt.smartFarmingService1.HeartRateRequest request,
        io.grpc.stub.StreamObserver<jt.smartFarmingService1.HeartRateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHeartRateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHeartRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                jt.smartFarmingService1.HeartRateRequest,
                jt.smartFarmingService1.HeartRateResponse>(
                  this, METHODID_GET_HEART_RATE)))
          .build();
    }
  }

  /**
   */
  public static final class LiveStockService1Stub extends io.grpc.stub.AbstractStub<LiveStockService1Stub> {
    private LiveStockService1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private LiveStockService1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveStockService1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LiveStockService1Stub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getHeartRate(jt.smartFarmingService1.HeartRateRequest request,
        io.grpc.stub.StreamObserver<jt.smartFarmingService1.HeartRateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHeartRateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LiveStockService1BlockingStub extends io.grpc.stub.AbstractStub<LiveStockService1BlockingStub> {
    private LiveStockService1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LiveStockService1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveStockService1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LiveStockService1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public jt.smartFarmingService1.HeartRateResponse getHeartRate(jt.smartFarmingService1.HeartRateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHeartRateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LiveStockService1FutureStub extends io.grpc.stub.AbstractStub<LiveStockService1FutureStub> {
    private LiveStockService1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LiveStockService1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveStockService1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LiveStockService1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jt.smartFarmingService1.HeartRateResponse> getHeartRate(
        jt.smartFarmingService1.HeartRateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHeartRateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HEART_RATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LiveStockService1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LiveStockService1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEART_RATE:
          serviceImpl.getHeartRate((jt.smartFarmingService1.HeartRateRequest) request,
              (io.grpc.stub.StreamObserver<jt.smartFarmingService1.HeartRateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LiveStockService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LiveStockService1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return jt.smartFarmingService1.Service1LiveStockImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LiveStockService1");
    }
  }

  private static final class LiveStockService1FileDescriptorSupplier
      extends LiveStockService1BaseDescriptorSupplier {
    LiveStockService1FileDescriptorSupplier() {}
  }

  private static final class LiveStockService1MethodDescriptorSupplier
      extends LiveStockService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LiveStockService1MethodDescriptorSupplier(String methodName) {
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
      synchronized (LiveStockService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LiveStockService1FileDescriptorSupplier())
              .addMethod(getGetHeartRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
