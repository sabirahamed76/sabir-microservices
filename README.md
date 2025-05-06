sabir-microservices
-----------------------

1. Eureka Server http://localhost:8987/server/data
access the eureka server console by http://localhost:8761/

2. Config Server http://localhost:8088

3. Eureka Client Product Producer http://localhost:8987/product/data
http://localhost:8987/product/product
http://localhost:8987/product/product/1
http://localhost:8987/product/product/listAll
http://localhost:8987/product/product/entity

4. Eureka Client Cart Producer http://localhost:8988/cart/data
http://localhost:8988/cart/getCartData

5. Eureka Client Payment Consumer http://localhost:8990/payment/data
http://localhost:8990/payment/getCartService

6. Feign Client Listing Consumer http://localhost:8991/listing/data
http://localhost:8991/listing/getProductService
http://localhost:8991/listing/getAllProducts
http://localhost:8991/listing/getProduct/1
http://localhost:8991/listing/entityData