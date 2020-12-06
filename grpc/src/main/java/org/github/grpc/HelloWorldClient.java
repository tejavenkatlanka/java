package org.github.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.logging.Logger;
import org.github.grpc.examples.helloworld.GreeterGrpc;
import org.github.grpc.examples.helloworld.HelloReply;
import org.github.grpc.examples.helloworld.HelloRequest;

public class HelloWorldClient {
  private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());

  public static void main(String[] args) {
    ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build();
    GreeterGrpc.GreeterBlockingStub greeterBlockingStub = GreeterGrpc
        .newBlockingStub(managedChannel);
    HelloReply sayHello = greeterBlockingStub
        .sayHello(HelloRequest.newBuilder().setName("test client").build());
    logger.info(sayHello.toString());
    sayHello=greeterBlockingStub
        .sayHello(HelloRequest.newBuilder().setName("test client message 1").build());
    logger.info(sayHello.toString());

  }
}
