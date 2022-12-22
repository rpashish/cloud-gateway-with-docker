package com.ashish.spring.demo.cloud.api.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ashish.spring.demo.cloud.api.gateway.service.config"})
@EnableDiscoveryClient
public class CloudApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiGatewayServiceApplication.class, args);
	}

}
