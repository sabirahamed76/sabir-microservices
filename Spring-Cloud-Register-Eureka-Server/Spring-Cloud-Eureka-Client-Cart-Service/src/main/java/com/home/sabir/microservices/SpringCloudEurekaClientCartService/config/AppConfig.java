package com.home.sabir.microservices.SpringCloudEurekaClientCartService.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.home.sabir.microservices.SpringCloudEurekaClientCartService.*") 
public class AppConfig {
  
}