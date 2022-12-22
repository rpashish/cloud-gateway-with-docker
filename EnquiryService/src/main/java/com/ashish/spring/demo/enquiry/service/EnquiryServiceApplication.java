package com.ashish.spring.demo.enquiry.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients("com.ashish.spring.demo.enquiry.client")
@ComponentScan(basePackages = {"com.ashish.spring.demo.enquiry.controller"})
public class EnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnquiryServiceApplication.class, args);
	}

}
