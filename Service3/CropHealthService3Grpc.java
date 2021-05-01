package jt.smartFarmingService3;

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
    comments = "Source: Service3CropHealth.proto")
public final class CropHealthService3Grpc {

  private CropHealthService3Grpc() {}

  public static final String SERVICE_NAME = "service3CropHealth.CropHealthService3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<jt.smartFarmingService3.cropHealthRequest,
      jt.smartFarmingService3.cropHealthResponse> getCropHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cropHealth",
      requestType = jt.smartFarmingService3.cropHealthRequest.class,
      responseType = jt.smartFarmingService3.cropHealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<jt.smartFarmingService3.cropHealthRequest,
      jt.smartFarmingService3.cropHealthResponse> getCropHealthMethod() {
    io.grpc.MethodDescriptor<jt.smartFarmingService3.cropHealthRequest, jt.smartFarmingService3.cropHealthResponse> getCropHealthMethod;
    if ((getCropHealthMethod = CropHealthService3Grpc.getCropHealthMethod) == null) {
      synchronized (CropHealthService3Grpc.class) {
        if ((getCropHealthMethod = CropHealthService3Grpc.getCropHealthMethod) == null) {
          CropHealthService3Grpc.getCropHealthMethod = getCropHealthMethod = 
              io.grpc.MethodDescriptor.<jt.smartFarmingService3.cropHealthRequest, jt.smartFarmingService3.cropHealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3CropHealth.CropHealthService3", "cropHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService3.cropHealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService3.cropHealthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropHealthService3MethodDescriptorSupplier("cropHealth"))
                  .build();
          }
        }
     }
     return getCropHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jt.smartFarmingService3.infestationRequest,
      jt.smartFarmingService3.infestationResponse> getCropInfestationLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cropInfestationLevel",
      requestType = jt.smartFarmingService3.infestationRequest.class,
      responseType = jt.smartFarmingService3.infestationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<jt.smartFarmingService3.infestationRequest,
      jt.smartFarmingService3.infestationResponse> getCropInfestationLevelMethod() {
    io.grpc.MethodDescriptor<jt.smartFarmingService3.infestationRequest, jt.smartFarmingService3.infestationResponse> getCropInfestationLevelMethod;
    if ((getCropInfestationLevelMethod = CropHealthService3Grpc.getCropInfestationLevelMethod) == null) {
      synchronized (CropHealthService3Grpc.class) {
        if ((getCropInfestationLevelMethod = CropHealthService3Grpc.getCropInfestationLevelMethod) == null) {
          CropHealthService3Grpc.getCropInfestationLevelMethod = getCropInfestationLevelMethod = 
              io.grpc.MethodDescriptor.<jt.smartFarmingService3.infestationRequest, jt.smartFarmingService3.infestationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3CropHealth.CropHealthService3", "cropInfestationLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService3.infestationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jt.smartFarmingService3.infestationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropHealthService3MethodDescriptorSupplier("cropInfestationLevel"))
                  .build();
          }
        }
     }
     return getCropInfestationLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CropHealthService3Stub newStub(io.grpc.Channel channel) {
    return new CropHealthService3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CropHealthService3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CropHealthService3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CropHealthService3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CropHealthService3FutureStub(channel);
  }

  /**
   */
  public static abstract class CropHealthService3ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void cropHealth(jt.smartFarmingService3.cropHealthRequest request,
        io.grpc.stub.StreamObserver<jt.smartFarmingService3.cropHealthResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCropHealthMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<jt.smartFarmingService3.infestationRequest> cropInfestationLevel(
        io.grpc.stub.StreamObserver<jt.smartFarmingService3.infestationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCropInfestationLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCropHealthMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                jt.smartFarmingService3.cropHealthRequest,
                jt.smartFarmingService3.cropHealthResponse>(
                  this, METHODID_CROP_HEALTH)))
          .addMethod(
            getCropInfestationLevelMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                jt.smartFarmingService3.infestationRequest,
                jt.smartFarmingService3.infestationResponse>(
                  this, METHODID_CROP_INFESTATION_LEVEL)))
          .build();
    }
  }

  /**
   */
  public static final class CropHealthService3Stub extends io.grpc.stub.AbstractStub<CropHealthService3Stub> {
    private CropHealthService3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private CropHealthService3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropHealthService3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CropHealthService3Stub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void cropHealth(jt.smartFarmingService3.cropHealthRequest request,
        io.grpc.stub.StreamObserver<jt.smartFarmingService3.cropHealthResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCropHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<jt.smartFarmingService3.infestationRequest> cropInfestationLevel(
        io.grpc.stub.StreamObserver<jt.smartFarmingService3.infestationResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCropInfestationLevelMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CropHealthService3BlockingStub extends io.grpc.stub.AbstractStub<CropHealthService3BlockingStub> {
    private CropHealthService3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CropHealthService3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropHealthService3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CropHealthService3BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<jt.smartFarmingService3.cropHealthResponse> cropHealth(
        jt.smartFarmingService3.cropHealthRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCropHealthMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CropHealthService3FutureStub extends io.grpc.stub.AbstractStub<CropHealthService3FutureStub> {
    private CropHealthService3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CropHealthService3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropHealthService3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CropHealthService3FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CROP_HEALTH = 0;
  private static final int METHODID_CROP_INFESTATION_LEVEL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CropHealthService3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CropHealthService3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CROP_HEALTH:
          serviceImpl.cropHealth((jt.smartFarmingService3.cropHealthRequest) request,
              (io.grpc.stub.StreamObserver<jt.smartFarmingService3.cropHealthResponse>) responseObserver);
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
        case METHODID_CROP_INFESTATION_LEVEL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cropInfestationLevel(
              (io.grpc.stub.StreamObserver<jt.smartFarmingService3.infestationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CropHealthService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CropHealthService3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return jt.smartFarmingService3.Service3CropHealthImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CropHealthService3");
    }
  }

  private static final class CropHealthService3FileDescriptorSupplier
      extends CropHealthService3BaseDescriptorSupplier {
    CropHealthService3FileDescriptorSupplier() {}
  }

  private static final class CropHealthService3MethodDescriptorSupplier
      extends CropHealthService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CropHealthService3MethodDescriptorSupplier(String methodName) {
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
      synchronized (CropHealthService3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CropHealthService3FileDescriptorSupplier())
              .addMethod(getCropHealthMethod())
              .addMethod(getCropInfestationLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
