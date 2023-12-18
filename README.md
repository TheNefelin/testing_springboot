# Testing Java Springboot

### First Steps

[doc](https://spring.io/guides/gs/maven/) [new project](https://start.spring.io/)

* create project maven
* Run and Debug

### Structure

> Folder structure options and naming conventions for software projects

    .
    ├── build                   # Compiled files (alternatively `dist`)
    ├── docs                    # Documentation files (alternatively `doc`)
    ├── src                     # Source files (alternatively `lib` or `app`)
    ├── test                    # Automated tests (alternatively `spec` or `tests`)
    ├── tools                   # Tools and utilities
    ├── LICENSE
    └── README.md

> Structure

    .
    ├── ...
    ├── test                    # Test files (alternatively `spec` or `tests`)
    │   ├── benchmarks          # Load and stress tests
    │   ├── integration         # End-to-end, integration tests (alternatively `e2e`)
    │   └── unit                # Unit tests
    └── ...

> Structure

    .
    ├── ...
    ├── main
    │   ├── java.com.package.project
    │   │   ├── configuration
    │   │   │   └── SecurityConfiguration.java
    │   │   ├── controller
    │   │   │   ├── Test.java
    │   │   │   └── User.java
    │   │   ├── dto
    │   │   │   ├── request
    │   │   │   │   ├── UserDto.java
    │   │   │   │   └── UserDtoUpdate.java
    │   │   │   └── response
    │   │   │       └── UserDtoRes.java
    │   │   ├── entity
    │   │   │   ├── repository
    │   │   │   │   └── UserRepository.java
    │   │   │   └── User.java
    │   │   ├── service
    │   │   │   └── UserService.java
    │   │   └── utils
    │   │       └── Utils.java
    │   └── resources
    │       └── application.properties                # db connection config
    └── ...

<hr>