package com.test.grpc;

import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.server.logging.LoggingService;
import java.util.concurrent.CompletableFuture;
import org.github.grpc.examples.helloworld.GreeterImpl;

public class GrpcSer {

  public static void main(String[] args) {
    ServerBuilder sb = Server.builder();
    sb.http(8080);
  sb.service(GrpcService.builder().addService(new GreeterImpl()).build(),
      LoggingService.newDecorator());

    Server server = sb.build();

    CompletableFuture<Void> future = server.start();
    future.join();

  }

}
