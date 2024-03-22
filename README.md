# SpringBootCrud3.2.4


### Project Details 
|||
|---|---|
|Project|Maven|
|Language|Java|
|Spring Boot|3.2.4|
|Java|17|
|Packaging|Jar|

### Dependencies 


- Spring Web

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

- 
	   <dependency>
	      <groupId>org.springdoc</groupId>
	      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
	      <version>2.4.0</version>
	   </dependency>


- Spring Boot DevTools

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>


- Lombok

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>


- Spring Actuator

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

### Migrating from SpringFox
(https://springdoc.org/migrating-from-springfox.html)

### springdoc-openapi v2.4.0
(https://springdoc.org/)

### Spring Boot Actuator
- http://localhost:8080/actuator

```

- Spring Data JPA 

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

- MySQL Driver

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>


- H2 Database

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>


- Spring Security

### Entities :

- Student
- Employee


### Spring Boot Profiles

- application.properties
- application-dev.properties
- aplication-prod.properties

### Spring Boot with H2 Database

- http://localhost:9090/h2-console


- http://localhost:9090/actuator

### SpringBoot Logging
```