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