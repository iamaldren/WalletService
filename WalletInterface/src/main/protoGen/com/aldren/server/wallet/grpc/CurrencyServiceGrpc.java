package com.aldren.server.wallet.grpc;

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
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: WalletService.proto")
public final class CurrencyServiceGrpc {

  private CurrencyServiceGrpc() {}

  public static final String SERVICE_NAME = "com.aldren.server.wallet.grpc.CurrencyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aldren.server.wallet.grpc.Currency,
      com.aldren.server.wallet.grpc.Empty> getCreateCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCurrency",
      requestType = com.aldren.server.wallet.grpc.Currency.class,
      responseType = com.aldren.server.wallet.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aldren.server.wallet.grpc.Currency,
      com.aldren.server.wallet.grpc.Empty> getCreateCurrencyMethod() {
    io.grpc.MethodDescriptor<com.aldren.server.wallet.grpc.Currency, com.aldren.server.wallet.grpc.Empty> getCreateCurrencyMethod;
    if ((getCreateCurrencyMethod = CurrencyServiceGrpc.getCreateCurrencyMethod) == null) {
      synchronized (CurrencyServiceGrpc.class) {
        if ((getCreateCurrencyMethod = CurrencyServiceGrpc.getCreateCurrencyMethod) == null) {
          CurrencyServiceGrpc.getCreateCurrencyMethod = getCreateCurrencyMethod =
              io.grpc.MethodDescriptor.<com.aldren.server.wallet.grpc.Currency, com.aldren.server.wallet.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.server.wallet.grpc.Currency.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.server.wallet.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CurrencyServiceMethodDescriptorSupplier("createCurrency"))
              .build();
        }
      }
    }
    return getCreateCurrencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aldren.server.wallet.grpc.Currency,
      com.aldren.server.wallet.grpc.Empty> getDeleteCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCurrency",
      requestType = com.aldren.server.wallet.grpc.Currency.class,
      responseType = com.aldren.server.wallet.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aldren.server.wallet.grpc.Currency,
      com.aldren.server.wallet.grpc.Empty> getDeleteCurrencyMethod() {
    io.grpc.MethodDescriptor<com.aldren.server.wallet.grpc.Currency, com.aldren.server.wallet.grpc.Empty> getDeleteCurrencyMethod;
    if ((getDeleteCurrencyMethod = CurrencyServiceGrpc.getDeleteCurrencyMethod) == null) {
      synchronized (CurrencyServiceGrpc.class) {
        if ((getDeleteCurrencyMethod = CurrencyServiceGrpc.getDeleteCurrencyMethod) == null) {
          CurrencyServiceGrpc.getDeleteCurrencyMethod = getDeleteCurrencyMethod =
              io.grpc.MethodDescriptor.<com.aldren.server.wallet.grpc.Currency, com.aldren.server.wallet.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.server.wallet.grpc.Currency.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.server.wallet.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CurrencyServiceMethodDescriptorSupplier("deleteCurrency"))
              .build();
        }
      }
    }
    return getDeleteCurrencyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurrencyServiceStub newStub(io.grpc.Channel channel) {
    return new CurrencyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurrencyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CurrencyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurrencyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CurrencyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CurrencyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCurrency(com.aldren.server.wallet.grpc.Currency request,
        io.grpc.stub.StreamObserver<com.aldren.server.wallet.grpc.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCurrencyMethod(), responseObserver);
    }

    /**
     */
    public void deleteCurrency(com.aldren.server.wallet.grpc.Currency request,
        io.grpc.stub.StreamObserver<com.aldren.server.wallet.grpc.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCurrencyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aldren.server.wallet.grpc.Currency,
                com.aldren.server.wallet.grpc.Empty>(
                  this, METHODID_CREATE_CURRENCY)))
          .addMethod(
            getDeleteCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aldren.server.wallet.grpc.Currency,
                com.aldren.server.wallet.grpc.Empty>(
                  this, METHODID_DELETE_CURRENCY)))
          .build();
    }
  }

  /**
   */
  public static final class CurrencyServiceStub extends io.grpc.stub.AbstractStub<CurrencyServiceStub> {
    private CurrencyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCurrency(com.aldren.server.wallet.grpc.Currency request,
        io.grpc.stub.StreamObserver<com.aldren.server.wallet.grpc.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCurrencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCurrency(com.aldren.server.wallet.grpc.Currency request,
        io.grpc.stub.StreamObserver<com.aldren.server.wallet.grpc.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCurrencyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CurrencyServiceBlockingStub extends io.grpc.stub.AbstractStub<CurrencyServiceBlockingStub> {
    private CurrencyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aldren.server.wallet.grpc.Empty createCurrency(com.aldren.server.wallet.grpc.Currency request) {
      return blockingUnaryCall(
          getChannel(), getCreateCurrencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aldren.server.wallet.grpc.Empty deleteCurrency(com.aldren.server.wallet.grpc.Currency request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCurrencyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CurrencyServiceFutureStub extends io.grpc.stub.AbstractStub<CurrencyServiceFutureStub> {
    private CurrencyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aldren.server.wallet.grpc.Empty> createCurrency(
        com.aldren.server.wallet.grpc.Currency request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCurrencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aldren.server.wallet.grpc.Empty> deleteCurrency(
        com.aldren.server.wallet.grpc.Currency request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CURRENCY = 0;
  private static final int METHODID_DELETE_CURRENCY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CurrencyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CurrencyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CURRENCY:
          serviceImpl.createCurrency((com.aldren.server.wallet.grpc.Currency) request,
              (io.grpc.stub.StreamObserver<com.aldren.server.wallet.grpc.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CURRENCY:
          serviceImpl.deleteCurrency((com.aldren.server.wallet.grpc.Currency) request,
              (io.grpc.stub.StreamObserver<com.aldren.server.wallet.grpc.Empty>) responseObserver);
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

  private static abstract class CurrencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurrencyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aldren.server.wallet.grpc.WalletServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CurrencyService");
    }
  }

  private static final class CurrencyServiceFileDescriptorSupplier
      extends CurrencyServiceBaseDescriptorSupplier {
    CurrencyServiceFileDescriptorSupplier() {}
  }

  private static final class CurrencyServiceMethodDescriptorSupplier
      extends CurrencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CurrencyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CurrencyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurrencyServiceFileDescriptorSupplier())
              .addMethod(getCreateCurrencyMethod())
              .addMethod(getDeleteCurrencyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
