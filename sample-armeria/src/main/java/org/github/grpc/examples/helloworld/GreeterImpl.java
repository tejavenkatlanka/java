package org.github.grpc.examples.helloworld;

import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreeterImpl extends SampleGrpc.SampleImplBase {
  Logger logger= LoggerFactory.getLogger(GreeterImpl.class);
  @Override
  public void sayHello(SampleRequest req, StreamObserver<SampleReply> responseObserver) {
    SampleReply reply = SampleReply.newBuilder().setMessage("Hello " + req.getName()).build();
    logger.info( "serving" +reply);
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}