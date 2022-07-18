package com.cts.quotesmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuotesmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotesmicroserviceApplication.class, args);
	}

}
