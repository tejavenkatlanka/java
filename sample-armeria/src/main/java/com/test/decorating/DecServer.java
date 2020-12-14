package com.test.decorating;

import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.HttpService;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.annotation.Default;
import com.linecorp.armeria.server.annotation.Get;
import com.linecorp.armeria.server.annotation.Param;

public class DecServer {

  public static void main(String[] args) {

    ServerBuilder sb = Server.builder();
    HttpService service = null;
    sb.annotatedService(new Object() {
      @Get("/greet5")
      public HttpResponse greet(@Param("name") String name,
          @Param("title") @Default("Mr.") String title) {
        // "Mr." is used by default if there is no title parameter in the request.
        return HttpResponse.of("Hello, %s %s!", title, name);
      }
    });
    sb.serviceUnder("/web", service.decorate((delegate, ctx, req) -> {
      if (!authenticate(req)) {
        // Authentication failed; fail the request.
        return HttpResponse.of(HttpStatus.UNAUTHORIZED);
      }

       return delegate.serve(ctx, req);
    }));
  }

  private static boolean authenticate(HttpRequest req) {
    return  true;
  }
}
