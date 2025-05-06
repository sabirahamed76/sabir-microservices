package com.home.sabir.microservices.SpringCloudEurekaServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerRestController  {

        @Autowired
        Environment environment;

        @GetMapping("/data")
        public String getServerData() {
           return "EUREKA-SERVER, Running on port: "
             +environment.getProperty("local.server.port");
        }
        

         
         
}