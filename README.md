sabir-microservices
-----------------------

Installation
------------
- Install Docker from https://www.docker.com/get-started/ and run the Docker Desktop Installer.exe


- Open Command Prompt run the below command for install zipkin in docker
	docker run -d -p 9411:9411 openzipkin/zipkin

Topics
------
	Eureka Server (Can be found in Service Registry)
	
	Cloud Config Server (Can be found in Cloud Config Server)
	
	API Gateway (Can be found in API Gateway)
	
	Discovery Client (Can be found in Department, Employee, Product, Cart Payment Service)
	
	Feign Client (Can be found in Listing Service)
	
	Swagger OpenAPI Integration(Can be found in Customer Service)
	
	
	


Execution Steps
----------------
- Service Registry
	http://localhost:8761/server/data
	saccess the eureka server console by http://localhost:8761/


- Config Server http://localhost:8088


- Browse Zipkin http://localhost:9411/zipkin/


- Discovery Client Department Service
	http://localhost:8081/department/data
	GET http://localhost:8081/department
	
	POST http://localhost:8081/department
	{
		"id": 1,
		"name": "dept1"
	}
	
	GET http://localhost:8081/department/1
	
	GET http://localhost:8081/department/with-employees

- Discovery Client Employee Service

	http://localhost:8082/employee/data
	GET http://localhost:8082/employee
	
	POST http://localhost:8082/employee
	{
		"id": 1,
		"departmentId": 1,
		"name": "sabeer",
		"age": 50,
		"position": "manager"
	}

	GET http://localhost:8082/employee/department/1

- Discovery Client Product Service
	http://localhost:8083/product/data
	http://localhost:8083/product/product
	http://localhost:8083/product/product/1
	http://localhost:8083/product/product/listAll
	http://localhost:8083/product/product/entity


- Discovery Client Cart Service 
	http://localhost:8084/cart/data
	http://localhost:8084/cart/getCartData


- Discovery Client Payment Service  
	http://localhost:8085/payment/data
	http://localhost:8085/payment/getCartService


- Feign Client Listing Consumer Service
	http://localhost:8086/listing/data
	http://localhost:8086/listing/getProductService
	http://localhost:8086/listing/getAllProducts
	http://localhost:8086/listing/getProduct/1
	http://localhost:8086/listing/entityData


- Swagger Client Customer Service 
	http://localhost:8087/customer/data
	http://localhost:8087/sabir-swagger-customer-documentation
	http://localhost:8087/sabir-swagger-customer-api-docs




