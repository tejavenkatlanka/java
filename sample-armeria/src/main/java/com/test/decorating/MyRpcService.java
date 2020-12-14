package com.test.decorating;

import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.RpcRequest;
import com.linecorp.armeria.common.RpcResponse;
import com.linecorp.armeria.server.DecoratingService;
import com.linecorp.armeria.server.Service;
import com.linecorp.armeria.server.ServiceRequestContext;

// Transforms an RpcService into an HttpService.
public class MyRpcService extends DecoratingService<RpcRequest, RpcResponse,
    HttpRequest, HttpResponse> {

  public MyRpcService(Service<? super RpcRequest, ? extends RpcResponse> delegate) {
    super((Service<RpcRequest, RpcResponse>) delegate);
  }

  @Override
  public HttpResponse serve(ServiceRequestContext ctx, HttpRequest req) throws Exception {
    // This method has been greatly simplified for easier understanding.
    // In reality, we will have to do this asynchronously.
    RpcRequest rpcReq = convertToRpcRequest(req);
    RpcResponse rpcRes = unwrap().serve(ctx, rpcReq);
    return convertToHttpResponse(rpcRes);
  }

  private RpcRequest convertToRpcRequest(HttpRequest req) { return  null; }
  private HttpResponse convertToHttpResponse(RpcResponse res) { return  null; }
}