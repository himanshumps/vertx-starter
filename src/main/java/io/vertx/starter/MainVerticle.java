package io.vertx.starter;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
    int port = 8080;
	if(System.getenv("PORT") != null) 
		port=Integer.parseInt(System.getenv("PORT"));  
	vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Welcome to Learning Axis Hackathon. This is a Hello Vert.x application. This sampple app has been modified on 02/01/2021 !!"))
        .listen(port);
  }

}
