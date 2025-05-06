package com.home.sabir.microservices.SpringCloudEurekaClientProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProductApplication.class, args);
	}

}
