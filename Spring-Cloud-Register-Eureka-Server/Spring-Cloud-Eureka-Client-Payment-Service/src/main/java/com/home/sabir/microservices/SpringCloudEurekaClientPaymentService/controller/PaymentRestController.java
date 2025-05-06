package com.home.sabir.microservices.SpringCloudEurekaClientPaymentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.sabir.microservices.SpringCloudEurekaClientPaymentService.component.CartRestConsumer;

@RestController
@RequestMapping("/payment")
public class PaymentRestController implements ErrorController {

         @Autowired
         private CartRestConsumer consumer;  // HAS-A

         @GetMapping("/data")
         public String getPaymentData() {
        	 System.out.println("==================");
                return "FROM PAYMENT-SERVICE : " + consumer.getCartInfo();

         }
         
         @Override
         @RequestMapping("/error")
         @ResponseBody
         public String getErrorPath() {
             // TODO Auto-generated method stub
             return "No Mapping Found";
         }
}