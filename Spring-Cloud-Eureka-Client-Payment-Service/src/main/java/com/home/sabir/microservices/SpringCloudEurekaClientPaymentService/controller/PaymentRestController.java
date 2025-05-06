package com.home.sabir.microservices.SpringCloudEurekaClientPaymentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.sabir.microservices.SpringCloudEurekaClientPaymentService.component.CartRestConsumer;

@RestController
@RequestMapping("/payment")
public class PaymentRestController  {

         @Autowired
         private CartRestConsumer consumer;  // HAS-A

         @Autowired
         Environment environment;

         @GetMapping("/data")
         public String getProductData() {
            return "PAYMENT-SERVICE, Running on port: "
              +environment.getProperty("local.server.port");
         }
         
              
         @GetMapping("/getCartService")
         public String getCartInfo() {
            System.out.println(consumer.getClass().getName());  //prints as a proxy class
            return "Accessing from PAYMENT-SERVICE ==> " +consumer.getCartInfo();
         }

         
         
         
}