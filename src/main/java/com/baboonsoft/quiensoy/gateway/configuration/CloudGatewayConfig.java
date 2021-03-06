package com.baboonsoft.quiensoy.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudGatewayConfig {

	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
	        .route(r -> r.path("/api/quienSoy/players/**")
	        		.uri("http://localhost:8100/"))
	        .route(r -> r.path("/api/quienSoy/games/**")
	        		.uri("http://localhost:8200/"))
	        .route(r -> r.path("/api/quienSoy/guesses/**")
	        		.uri("http://localhost:8300/"))
	        .build();
    }
}
