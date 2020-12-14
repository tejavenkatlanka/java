package com.test.docser;

import com.linecorp.armeria.common.grpc.GrpcSerializationFormats;
import com.linecorp.armeria.internal.common.grpc.GrpcSerializationFormatProvider;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.docs.DocService;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.server.logging.LoggingService;
import java.util.concurrent.CompletableFuture;
import org.github.grpc.examples.helloworld.GreeterImpl;

public class DOCServ {

  public static void main(String[] args) {
    ServerBuilder sb = Server.builder();
    sb.http(8080);
    sb.service(GrpcService.builder().addService(new GreeterImpl())
            .supportedSerializationFormats(GrpcSerializationFormats.values())
            .enableUnframedRequests(true)
            .build(),
        LoggingService.newDecorator());
    //sb.annotatedService("/service", new MyAnnotatedService());
    sb.serviceUnder("/docs", new DocService());

    Server server = sb.build();

    CompletableFuture<Void> future = server.start();
    future.join();

  }
}
