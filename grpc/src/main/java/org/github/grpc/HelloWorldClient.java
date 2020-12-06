package org.github.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.github.grpc.examples.helloworld.GreeterGrpc;
import org.github.grpc.examples.helloworld.HelloReply;
import org.github.grpc.examples.helloworld.HelloRequest;

public class HelloWorldClient {

  public static void main(String[] args) {
    ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build();
    GreeterGrpc.GreeterBlockingStub greeterBlockingStub = GreeterGrpc
        .newBlockingStub(managedChannel);
    HelloReply sayHello = greeterBlockingStub
        .sayHello(HelloRequest.newBuilder().setName("test client").build());
    System.out.println(sayHello);
  }
}
