# Spring Apache Kafka Example

## Requirement
- Java
- Apache Kafka
- Postman

## Setup project
1. Install Apache Kafka on your machine
2. Run zookeper and kafka
3. Create a topic with name product-topic
4. Run consumer and producer with mvn spring-boot:run
5. Send data using postman via HTTP POST request to the producer app
6. Checkout the consumer app

## Screenshot

#### Create Product
![Send To Producer](https://github.com/raviMukti/spring-simple-kafka/blob/master/img/api-create-product.png)

#### Consumed/Listen Product
![Consumer Listen](https://github.com/raviMukti/spring-simple-kafka/blob/master/img/product-listener-service.png)
