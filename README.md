# SpringManager Prototype

A minimal Spring Boot 3 web application used as the starting point for a "SpringManager" project. It currently exposes a single greeting endpoint and contains the scaffolding (Maven Wrapper, test setup, datasource settings) for further development.

## Features

- Spring Boot web application with an embedded Tomcat server
- `GET /` returns a plain-text greeting
- Spring context smoke test (`@SpringBootTest`)

## Tech stack

| Component | Version |
|-----------|---------|
| Java | 17 |
| Spring Boot | 3.1.4 (`spring-boot-starter`, `spring-boot-starter-web`) |
| JUnit 5 | via `spring-boot-starter-test` |
| Build | Maven (wrapper included) |

## REST API

| Method | Path | Description | Response |
|--------|------|-------------|----------|
| `GET` | `/` | Greeting endpoint | `Greeting from Spring Boot!` (text) |

## Project structure

```
SpringManager_Prototype/
└── springmanager/                     # Maven project
    ├── pom.xml
    ├── mvnw, mvnw.cmd, .mvn/          # Maven Wrapper
    └── src/
        ├── main/java/com/managerpro/springmanager/
        │   ├── SpringmanagerApplication.java   # entry point
        │   └── HelloController.java            # GET /
        ├── main/resources/application.properties
        └── test/java/com/managerpro/springmanager/
            └── SpringmanagerApplicationTests.java
```

## Prerequisites

- JDK 17 or newer
- Maven 3.6+ (or the included Maven Wrapper)

## Configuration

`springmanager/src/main/resources/application.properties` contains MySQL datasource and JPA settings (`spring.datasource.*`, `spring.jpa.*`, `spring.sql.init.mode`). The project does not yet declare JPA or a MySQL driver dependency, so these keys are not used at the moment and **no database is required** to run the application. They are placeholders for when persistence is added; replace the sample credentials before using them.

The server listens on the Spring Boot default port `8080`.

## Build, run and test

All commands are run from the `springmanager/` directory:

```bash
cd springmanager

# Build
./mvnw -DskipTests package

# Run
./mvnw spring-boot:run
# or
java -jar target/springmanager-0.0.1-SNAPSHOT.jar

# Test
./mvnw test
```

Then open `http://localhost:8080/`.

On Windows use `mvnw.cmd` instead of `./mvnw`.

## License

Licensed under the Apache License 2.0. See [LICENSE](LICENSE).
