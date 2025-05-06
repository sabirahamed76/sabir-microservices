package com.home.sabir.microservices.SpringCloudEurekaClientCartService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCartApplication.class, args);
	}

}
