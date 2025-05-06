package com.home.sabir.microservices.SpringCloudEurekaClientPaymentService.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.home.sabir.microservices.SpringCloudEurekaClientPaymentService.*") 
public class AppConfig {
  
}