### Fibonacci served via web

#### Description

This project is a simple example of Spring framework used to create and submit a web form. Created application calculates
value in Fibonacci sequence for indicated via web form position/number. Only for training purpose Fibonacci values 
are calculated recursively. As a result time complexity of this algorithm is exponential O(2<sup>n</sup>) - apparently not
 very efficient. Thus JPA is used to store previously calculated values and speed up HTTP requests response time for them. 

#### Technological stack:
- JDK 1.8
- Maven 3.2+
- Spring Boot 2.1.4.RELEASE
- Thymeleaf
- Bootstrap
