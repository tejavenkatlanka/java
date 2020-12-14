package com.test.decorating;

import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.HttpService;
import com.linecorp.armeria.server.ServiceRequestContext;
import com.linecorp.armeria.server.SimpleDecoratingHttpService;

public class AuthService extends SimpleDecoratingHttpService {
  public AuthService(HttpService delegate) {
    super(delegate);
  }

  @Override
  public HttpResponse serve(ServiceRequestContext ctx, HttpRequest req) throws Exception {
    if (!authenticate(req)) {
      return HttpResponse.of(HttpStatus.UNAUTHORIZED);
    }

    HttpService delegate = (HttpService) unwrap();
    return delegate.serve(ctx, req);
  }

  private boolean authenticate(HttpRequest req) {
    return  true;
  }
}
