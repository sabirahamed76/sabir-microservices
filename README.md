sabir-microservices
-----------------------

Installation
------------

--Install Windows Subsystem for Linux (WSL) for UBUNTU by below Command
	wsl --install
	wsl --list --online
	wsl --version
	wsl --set-default-version 2
	
--To Start Ubuntu on windows by below command
	wsl -d Ubuntu
	
- Install Docker from https://www.docker.com/get-started/ and run the Docker Desktop Installer.exe

- Open Command Prompt run the below command for install Kafka in docker	
	docker pull apache/kafka:4.0.0

- Open Command Prompt run the below command for run Kafka in docker	
	docker run -p 9092:9092 apache/kafka:4.0.0

- Open Command Prompt run the below command for run Kafka in docker	
	docker run --name some-zookeeper --restart always -d zookeeper


- Open Command Prompt run the below command for run zipkin in docker
	docker run -d -p 9411:9411 openzipkin/zipkin
	
- Browse Zipkin http://localhost:9411/zipkin/

- Open Command Prompt run the below command for run mysql in docker
  docker run -p 3306:3306 --name root -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_DATABASE=asits -d mysql


Topics
------
	Eureka Server (Can be found in Service Registry)
	
	Cloud Config Server (Can be found in Cloud Config Server)
		- Refer https://javatechonline.com/how-to-implement-spring-cloud-config-server-in-microservices/
	
	API Gateway (Can be found in API Gateway)
		- Refer https://javatechonline.com/implement-api-gateway-spring-boot-microservices/
		
	Discovery Client (Can be found in Department, Employee, Product, Cart, Payment Service)
		- Refer  https://javatechonline.com/how-to-register-microservices-in-eureka-server/
		
	Web Client & Load Balancing (Can be found in Department, Employee Service)
	
	Feign Client (Can be found in Listing Service)
		- Refer https://javatechonline.com/how-to-implement-feign-client-in-spring-boot-microservices/
	
	Swagger OpenAPI Integration(Can be found in Customer Service)
	
	Fault Tolerance (Can be found in Customer Service)
		- Circuit Breaker, RateLimit, Retry, Bulk Head, TimeLimit
		- Refer https://javatechonline.com/fault-tolerance-in-microservices-resilience4j-spring-boot/
	
	
	


Execution Steps
----------------
- Browse Service Registry
	http://localhost:8761/server/data
	saccess the eureka server console by http://localhost:8761/


- Browse Config Server http://localhost:8088


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

- API Gateway
	http://localhost:8060/employee
	http://localhost:8060/department
	http://localhost:8060/department/with-employees
	


