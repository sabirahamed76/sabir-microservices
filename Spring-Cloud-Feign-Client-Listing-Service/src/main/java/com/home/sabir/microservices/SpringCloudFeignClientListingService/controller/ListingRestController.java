package com.home.sabir.microservices.SpringCloudFeignClientListingService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.sabir.microservices.SpringCloudFeignClientListingService.component.ProductRestConsumer;

@RestController
@RequestMapping("/listing")
public class ListingRestController  {

         @Autowired
         private ProductRestConsumer consumer;  // HAS-A
         
         @Autowired
         Environment environment;

         @GetMapping("/data")
         public String getListingInfo() {
            return "PRODUCT-SERVICE, Running on port: "
              +environment.getProperty("local.server.port");
         }
         @GetMapping("/getProductService")
         public String getProductInfo() {
            System.out.println(consumer.getClass().getName());  //prints as a proxy class
            return "Accessing from LISTING-SERVICE ==> " +consumer.getProductData();
         }

         @GetMapping("/getAllProducts")
         public String getBooksInfo() {
            return "Accessing from LISTING-SERVICE ==> " + consumer.getAllProducts();
         }

         @GetMapping("/getProduct/{id}")
         public String getProductDetail(@PathVariable Integer id) {
            return "Accessing from LISTING-SERVICE ==> " + consumer.getProductById(Long.valueOf(id)); 
         }

         @GetMapping("/entityData")
         public String printEntityData() {
            ResponseEntity<String> resp = consumer.getEntityData();
            return "Accessing from LISTING-SERVICE ==> " + resp.getBody() +" , status is:" + resp.getStatusCode();
         }
         
         
}