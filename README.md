# Microservice #

### About ###

This project contains the code to create a microservice using the 
[Spring Boot](http://spring.io/projects/spring-boot) framewowk. The code
also uses [Swagger](https://swagger.io/) by SMARTBEAR to document the service end points
and allow simple browser testing.

### Requirements ###

#### Maven ####
Make sure you have the latest version of [Maven](https://maven.apache.org/) on your classpath.

#### IDE ####
I would recommend either [Eclipse](https://www.eclipse.org/downloads/) or [IntelliJ](https://www.jetbrains.com/idea/?fromMenu).


### Building ###
From within the project directory execute
```bash
mvn clean install
```

### Usage ###
Once running, the Swagger description of the microservice can be accessed on [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)