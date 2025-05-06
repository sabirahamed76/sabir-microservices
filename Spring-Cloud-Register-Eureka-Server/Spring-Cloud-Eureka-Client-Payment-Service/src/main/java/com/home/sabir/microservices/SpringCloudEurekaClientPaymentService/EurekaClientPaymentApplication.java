package com.home.sabir.microservices.SpringCloudEurekaClientPaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientPaymentApplication.class, args);
	}

}
