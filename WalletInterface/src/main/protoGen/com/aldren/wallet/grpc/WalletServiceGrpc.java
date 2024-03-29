package com.aldren.wallet.grpc;

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
public final class WalletServiceGrpc {

  private WalletServiceGrpc() {}

  public static final String SERVICE_NAME = "com.aldren.wallet.grpc.WalletService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aldren.wallet.grpc.WalletRequest,
      com.aldren.wallet.grpc.Empty> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deposit",
      requestType = com.aldren.wallet.grpc.WalletRequest.class,
      responseType = com.aldren.wallet.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aldren.wallet.grpc.WalletRequest,
      com.aldren.wallet.grpc.Empty> getDepositMethod() {
    io.grpc.MethodDescriptor<com.aldren.wallet.grpc.WalletRequest, com.aldren.wallet.grpc.Empty> getDepositMethod;
    if ((getDepositMethod = WalletServiceGrpc.getDepositMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getDepositMethod = WalletServiceGrpc.getDepositMethod) == null) {
          WalletServiceGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.aldren.wallet.grpc.WalletRequest, com.aldren.wallet.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.WalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aldren.wallet.grpc.WalletRequest,
      com.aldren.wallet.grpc.Empty> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "withdraw",
      requestType = com.aldren.wallet.grpc.WalletRequest.class,
      responseType = com.aldren.wallet.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aldren.wallet.grpc.WalletRequest,
      com.aldren.wallet.grpc.Empty> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.aldren.wallet.grpc.WalletRequest, com.aldren.wallet.grpc.Empty> getWithdrawMethod;
    if ((getWithdrawMethod = WalletServiceGrpc.getWithdrawMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getWithdrawMethod = WalletServiceGrpc.getWithdrawMethod) == null) {
          WalletServiceGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.aldren.wallet.grpc.WalletRequest, com.aldren.wallet.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.WalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aldren.wallet.grpc.User,
      com.aldren.wallet.grpc.Balance> getCheckBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkBalance",
      requestType = com.aldren.wallet.grpc.User.class,
      responseType = com.aldren.wallet.grpc.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aldren.wallet.grpc.User,
      com.aldren.wallet.grpc.Balance> getCheckBalanceMethod() {
    io.grpc.MethodDescriptor<com.aldren.wallet.grpc.User, com.aldren.wallet.grpc.Balance> getCheckBalanceMethod;
    if ((getCheckBalanceMethod = WalletServiceGrpc.getCheckBalanceMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getCheckBalanceMethod = WalletServiceGrpc.getCheckBalanceMethod) == null) {
          WalletServiceGrpc.getCheckBalanceMethod = getCheckBalanceMethod =
              io.grpc.MethodDescriptor.<com.aldren.wallet.grpc.User, com.aldren.wallet.grpc.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("checkBalance"))
              .build();
        }
      }
    }
    return getCheckBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aldren.wallet.grpc.User,
      com.aldren.wallet.grpc.Transactions> getCheckTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkTransactions",
      requestType = com.aldren.wallet.grpc.User.class,
      responseType = com.aldren.wallet.grpc.Transactions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aldren.wallet.grpc.User,
      com.aldren.wallet.grpc.Transactions> getCheckTransactionsMethod() {
    io.grpc.MethodDescriptor<com.aldren.wallet.grpc.User, com.aldren.wallet.grpc.Transactions> getCheckTransactionsMethod;
    if ((getCheckTransactionsMethod = WalletServiceGrpc.getCheckTransactionsMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getCheckTransactionsMethod = WalletServiceGrpc.getCheckTransactionsMethod) == null) {
          WalletServiceGrpc.getCheckTransactionsMethod = getCheckTransactionsMethod =
              io.grpc.MethodDescriptor.<com.aldren.wallet.grpc.User, com.aldren.wallet.grpc.Transactions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aldren.wallet.grpc.Transactions.getDefaultInstance()))
              .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("checkTransactions"))
              .build();
        }
      }
    }
    return getCheckTransactionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletServiceStub newStub(io.grpc.Channel channel) {
    return new WalletServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WalletServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deposit(com.aldren.wallet.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    public void withdraw(com.aldren.wallet.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void checkBalance(com.aldren.wallet.grpc.User request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Balance> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckBalanceMethod(), responseObserver);
    }

    /**
     */
    public void checkTransactions(com.aldren.wallet.grpc.User request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Transactions> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckTransactionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDepositMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aldren.wallet.grpc.WalletRequest,
                com.aldren.wallet.grpc.Empty>(
                  this, METHODID_DEPOSIT)))
          .addMethod(
            getWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aldren.wallet.grpc.WalletRequest,
                com.aldren.wallet.grpc.Empty>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getCheckBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aldren.wallet.grpc.User,
                com.aldren.wallet.grpc.Balance>(
                  this, METHODID_CHECK_BALANCE)))
          .addMethod(
            getCheckTransactionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aldren.wallet.grpc.User,
                com.aldren.wallet.grpc.Transactions>(
                  this, METHODID_CHECK_TRANSACTIONS)))
          .build();
    }
  }

  /**
   */
  public static final class WalletServiceStub extends io.grpc.stub.AbstractStub<WalletServiceStub> {
    private WalletServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceStub(channel, callOptions);
    }

    /**
     */
    public void deposit(com.aldren.wallet.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(com.aldren.wallet.grpc.WalletRequest request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkBalance(com.aldren.wallet.grpc.User request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Balance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTransactions(com.aldren.wallet.grpc.User request,
        io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Transactions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckTransactionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletServiceBlockingStub extends io.grpc.stub.AbstractStub<WalletServiceBlockingStub> {
    private WalletServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aldren.wallet.grpc.Empty deposit(com.aldren.wallet.grpc.WalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aldren.wallet.grpc.Empty withdraw(com.aldren.wallet.grpc.WalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aldren.wallet.grpc.Balance checkBalance(com.aldren.wallet.grpc.User request) {
      return blockingUnaryCall(
          getChannel(), getCheckBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aldren.wallet.grpc.Transactions checkTransactions(com.aldren.wallet.grpc.User request) {
      return blockingUnaryCall(
          getChannel(), getCheckTransactionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletServiceFutureStub extends io.grpc.stub.AbstractStub<WalletServiceFutureStub> {
    private WalletServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aldren.wallet.grpc.Empty> deposit(
        com.aldren.wallet.grpc.WalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aldren.wallet.grpc.Empty> withdraw(
        com.aldren.wallet.grpc.WalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aldren.wallet.grpc.Balance> checkBalance(
        com.aldren.wallet.grpc.User request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aldren.wallet.grpc.Transactions> checkTransactions(
        com.aldren.wallet.grpc.User request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckTransactionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_CHECK_BALANCE = 2;
  private static final int METHODID_CHECK_TRANSACTIONS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.aldren.wallet.grpc.WalletRequest) request,
              (io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Empty>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.aldren.wallet.grpc.WalletRequest) request,
              (io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Empty>) responseObserver);
          break;
        case METHODID_CHECK_BALANCE:
          serviceImpl.checkBalance((com.aldren.wallet.grpc.User) request,
              (io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Balance>) responseObserver);
          break;
        case METHODID_CHECK_TRANSACTIONS:
          serviceImpl.checkTransactions((com.aldren.wallet.grpc.User) request,
              (io.grpc.stub.StreamObserver<com.aldren.wallet.grpc.Transactions>) responseObserver);
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

  private static abstract class WalletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aldren.wallet.grpc.WalletServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletService");
    }
  }

  private static final class WalletServiceFileDescriptorSupplier
      extends WalletServiceBaseDescriptorSupplier {
    WalletServiceFileDescriptorSupplier() {}
  }

  private static final class WalletServiceMethodDescriptorSupplier
      extends WalletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WalletServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletServiceFileDescriptorSupplier())
              .addMethod(getDepositMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getCheckBalanceMethod())
              .addMethod(getCheckTransactionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
