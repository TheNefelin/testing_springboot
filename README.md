# Testing Java Springboot

### First Steps

[doc](https://spring.io/guides/gs/maven/) [new project](https://start.spring.io/)

* create project maven
* Run and Debug

### Structure

> Folder structure

    .
    ├── ...
    ├── main
    │   ├── java.com.package.project
    │   │   ├── configuration
    │   │   │   └── SecurityConfiguration.java    # Cors config
    │   │   ├── controller                        # Endpoint controller
    │   │   │   ├── Test.java
    │   │   │   └── User.java
    │   │   ├── dto                               # Data transfer object, similar to object model
    │   │   │   ├── request
    │   │   │   │   ├── UserDto.java
    │   │   │   │   └── UserDtoUpdate.java
    │   │   │   └── response
    │   │   │       └── UserDtoRes.java
    │   │   ├── entity                            # ORM object model
    │   │   │   ├── repository                    # ORM additional CRUD function
    │   │   │   │   └── UserRepository.java
    │   │   │   └── User.java
    │   │   ├── service                           # ORM CRUD        
    │   │   │   └── UserService.java
    │   │   └── utils
    │   │       └── Utils.java
    │   └── resources
    │       └── application.properties            # db connection config
    └── ...

<hr>

VAriables de entorno

Path: %JAVA_HOME%\bin
JAVA_HOME: C:\jdk-17.0.2

java --version

Extencion pack java vsCode

https://start.spring.io/

Paquetes
-Lombok
-MySQL
-SqlServer
-SpringWeb
-SpringSecurity
-JPA (orm)

anotaciones = directiva = decorador
@restcontroller

// archivo de configuracion
application.properties

dto = Data Transfer Object

Rol, Privilegios, Productos, Ventas y Marca

		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>