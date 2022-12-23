package com.ashish.spring.demo.cloud.api.gateway.service.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CloudRoutingConfig {
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes().route(
                r-> r.path("/product-enquiry/**")
                .uri("http://enquiry-service:9004/")               
        ).build();
    }

}
