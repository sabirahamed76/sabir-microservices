package com.home.sabir.microservices.SpringCloudEurekaClientCartService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartRestController {

	
	@Autowired
    Environment environment;

    @GetMapping("/data")
    public String getServerData() {
       return "CART-SERVICE, Running on port: "
         +environment.getProperty("local.server.port");
    }
    
      @GetMapping("/getCartData")
      public String getCartData() {
                 return "Returning data from CART-SERVICE";
      }
}