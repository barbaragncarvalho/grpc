package br.pucminas.labdamd.central;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: central.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CentralAtendimentoGrpc {

  private CentralAtendimentoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "central.CentralAtendimento";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.pucminas.labdamd.central.PerguntaHorario,
      br.pucminas.labdamd.central.RespostaHorario> getConsultarHorarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsultarHorario",
      requestType = br.pucminas.labdamd.central.PerguntaHorario.class,
      responseType = br.pucminas.labdamd.central.RespostaHorario.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.pucminas.labdamd.central.PerguntaHorario,
      br.pucminas.labdamd.central.RespostaHorario> getConsultarHorarioMethod() {
    io.grpc.MethodDescriptor<br.pucminas.labdamd.central.PerguntaHorario, br.pucminas.labdamd.central.RespostaHorario> getConsultarHorarioMethod;
    if ((getConsultarHorarioMethod = CentralAtendimentoGrpc.getConsultarHorarioMethod) == null) {
      synchronized (CentralAtendimentoGrpc.class) {
        if ((getConsultarHorarioMethod = CentralAtendimentoGrpc.getConsultarHorarioMethod) == null) {
          CentralAtendimentoGrpc.getConsultarHorarioMethod = getConsultarHorarioMethod =
              io.grpc.MethodDescriptor.<br.pucminas.labdamd.central.PerguntaHorario, br.pucminas.labdamd.central.RespostaHorario>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsultarHorario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.pucminas.labdamd.central.PerguntaHorario.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.pucminas.labdamd.central.RespostaHorario.getDefaultInstance()))
              .setSchemaDescriptor(new CentralAtendimentoMethodDescriptorSupplier("ConsultarHorario"))
              .build();
        }
      }
    }
    return getConsultarHorarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.pucminas.labdamd.central.InscricaoAvisos,
      br.pucminas.labdamd.central.Aviso> getAcompanharAvisosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcompanharAvisos",
      requestType = br.pucminas.labdamd.central.InscricaoAvisos.class,
      responseType = br.pucminas.labdamd.central.Aviso.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<br.pucminas.labdamd.central.InscricaoAvisos,
      br.pucminas.labdamd.central.Aviso> getAcompanharAvisosMethod() {
    io.grpc.MethodDescriptor<br.pucminas.labdamd.central.InscricaoAvisos, br.pucminas.labdamd.central.Aviso> getAcompanharAvisosMethod;
    if ((getAcompanharAvisosMethod = CentralAtendimentoGrpc.getAcompanharAvisosMethod) == null) {
      synchronized (CentralAtendimentoGrpc.class) {
        if ((getAcompanharAvisosMethod = CentralAtendimentoGrpc.getAcompanharAvisosMethod) == null) {
          CentralAtendimentoGrpc.getAcompanharAvisosMethod = getAcompanharAvisosMethod =
              io.grpc.MethodDescriptor.<br.pucminas.labdamd.central.InscricaoAvisos, br.pucminas.labdamd.central.Aviso>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcompanharAvisos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.pucminas.labdamd.central.InscricaoAvisos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.pucminas.labdamd.central.Aviso.getDefaultInstance()))
              .setSchemaDescriptor(new CentralAtendimentoMethodDescriptorSupplier("AcompanharAvisos"))
              .build();
        }
      }
    }
    return getAcompanharAvisosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CentralAtendimentoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CentralAtendimentoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CentralAtendimentoStub>() {
        @java.lang.Override
        public CentralAtendimentoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CentralAtendimentoStub(channel, callOptions);
        }
      };
    return CentralAtendimentoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CentralAtendimentoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CentralAtendimentoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CentralAtendimentoBlockingStub>() {
        @java.lang.Override
        public CentralAtendimentoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CentralAtendimentoBlockingStub(channel, callOptions);
        }
      };
    return CentralAtendimentoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CentralAtendimentoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CentralAtendimentoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CentralAtendimentoFutureStub>() {
        @java.lang.Override
        public CentralAtendimentoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CentralAtendimentoFutureStub(channel, callOptions);
        }
      };
    return CentralAtendimentoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC unário: uma pergunta, uma resposta - "parece" uma chamada de função comum
     * </pre>
     */
    default void consultarHorario(br.pucminas.labdamd.central.PerguntaHorario request,
        io.grpc.stub.StreamObserver<br.pucminas.labdamd.central.RespostaHorario> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultarHorarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC com streaming de servidor: uma inscrição, várias respostas ao longo do tempo
     * </pre>
     */
    default void acompanharAvisos(br.pucminas.labdamd.central.InscricaoAvisos request,
        io.grpc.stub.StreamObserver<br.pucminas.labdamd.central.Aviso> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcompanharAvisosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CentralAtendimento.
   */
  public static abstract class CentralAtendimentoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CentralAtendimentoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CentralAtendimento.
   */
  public static final class CentralAtendimentoStub
      extends io.grpc.stub.AbstractAsyncStub<CentralAtendimentoStub> {
    private CentralAtendimentoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CentralAtendimentoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CentralAtendimentoStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC unário: uma pergunta, uma resposta - "parece" uma chamada de função comum
     * </pre>
     */
    public void consultarHorario(br.pucminas.labdamd.central.PerguntaHorario request,
        io.grpc.stub.StreamObserver<br.pucminas.labdamd.central.RespostaHorario> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultarHorarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC com streaming de servidor: uma inscrição, várias respostas ao longo do tempo
     * </pre>
     */
    public void acompanharAvisos(br.pucminas.labdamd.central.InscricaoAvisos request,
        io.grpc.stub.StreamObserver<br.pucminas.labdamd.central.Aviso> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAcompanharAvisosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CentralAtendimento.
   */
  public static final class CentralAtendimentoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CentralAtendimentoBlockingStub> {
    private CentralAtendimentoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CentralAtendimentoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CentralAtendimentoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC unário: uma pergunta, uma resposta - "parece" uma chamada de função comum
     * </pre>
     */
    public br.pucminas.labdamd.central.RespostaHorario consultarHorario(br.pucminas.labdamd.central.PerguntaHorario request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultarHorarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC com streaming de servidor: uma inscrição, várias respostas ao longo do tempo
     * </pre>
     */
    public java.util.Iterator<br.pucminas.labdamd.central.Aviso> acompanharAvisos(
        br.pucminas.labdamd.central.InscricaoAvisos request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAcompanharAvisosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CentralAtendimento.
   */
  public static final class CentralAtendimentoFutureStub
      extends io.grpc.stub.AbstractFutureStub<CentralAtendimentoFutureStub> {
    private CentralAtendimentoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CentralAtendimentoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CentralAtendimentoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC unário: uma pergunta, uma resposta - "parece" uma chamada de função comum
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<br.pucminas.labdamd.central.RespostaHorario> consultarHorario(
        br.pucminas.labdamd.central.PerguntaHorario request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultarHorarioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSULTAR_HORARIO = 0;
  private static final int METHODID_ACOMPANHAR_AVISOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSULTAR_HORARIO:
          serviceImpl.consultarHorario((br.pucminas.labdamd.central.PerguntaHorario) request,
              (io.grpc.stub.StreamObserver<br.pucminas.labdamd.central.RespostaHorario>) responseObserver);
          break;
        case METHODID_ACOMPANHAR_AVISOS:
          serviceImpl.acompanharAvisos((br.pucminas.labdamd.central.InscricaoAvisos) request,
              (io.grpc.stub.StreamObserver<br.pucminas.labdamd.central.Aviso>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getConsultarHorarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.pucminas.labdamd.central.PerguntaHorario,
              br.pucminas.labdamd.central.RespostaHorario>(
                service, METHODID_CONSULTAR_HORARIO)))
        .addMethod(
          getAcompanharAvisosMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              br.pucminas.labdamd.central.InscricaoAvisos,
              br.pucminas.labdamd.central.Aviso>(
                service, METHODID_ACOMPANHAR_AVISOS)))
        .build();
  }

  private static abstract class CentralAtendimentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CentralAtendimentoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.pucminas.labdamd.central.CentralProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CentralAtendimento");
    }
  }

  private static final class CentralAtendimentoFileDescriptorSupplier
      extends CentralAtendimentoBaseDescriptorSupplier {
    CentralAtendimentoFileDescriptorSupplier() {}
  }

  private static final class CentralAtendimentoMethodDescriptorSupplier
      extends CentralAtendimentoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CentralAtendimentoMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CentralAtendimentoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CentralAtendimentoFileDescriptorSupplier())
              .addMethod(getConsultarHorarioMethod())
              .addMethod(getAcompanharAvisosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
