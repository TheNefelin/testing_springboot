# Testing Java Springboot

### First Steps

* Environment Variables
> Path: %JAVA_HOME%\bin
> JAVA_HOME: C:\jdk-17.0.2
> java --version

[doc](https://spring.io/guides/gs/maven/) [new project](https://start.spring.io/)

### Some package
* Lombok
* MySQL
* SqlServer
* SpringWeb
* SpringSecurity
* JPA (orm)

> create project maven
> Run and Debug

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
    │   │   │   ├── Brand.java
    │   │   │   ├── privilege.java
    │   │   │   ├── Product.java
    │   │   │   ├── Rol.java
    │   │   │   ├── Sale.java
    │   │   │   └── User.java
    │   │   ├── service                           # ORM CRUD        
    │   │   │   └── UserService.java
    │   │   └── utils
    │   │       └── Utils.java
    │   └── resources
    │       └── application.properties            # Config file
    └── ...

<hr>

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

- [x] Java 8
- [x] Spring Boot
- [x] JWT (autenticación y autorización)
- [x] JPA 
- [x] OpenApi (Documentación del los Microservicios)
- [x] Swagger (Documentación de los Microservicios)
- [x] Ejercicio en procesos de CI-CD, integración continua