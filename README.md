# SpringBoot-Hyder-Abbas

A collection of Spring Boot practice projects written while learning Spring (most packages use `com.telusko`). Each folder is a separate, self-contained Maven project with its own `pom.xml` and Maven wrapper. The projects cover Spring Core and dependency injection, Spring MVC with JSP and Thymeleaf, REST APIs, Spring Data JPA, AOP, Actuator, profiles, HATEOAS, Spring Batch, Apache Kafka, and Spring Security (including JWT and OAuth2 login).

## Tech Stack

- Java 17 or 21 (depends on the project)
- Spring Boot 3.1 - 3.5 (and 4.0.0 for `Spring_Security_App/demo`)
- Maven (wrapper included in each project)
- Spring Web, Spring Data JPA, Spring Security, Spring Batch, Spring Kafka, Spring HATEOAS
- JSP/JSTL and Thymeleaf for server-rendered views
- PostgreSQL and MySQL for the database-backed projects
- Apache Kafka for the messaging projects

## Projects

### `SpringCore_and_SpringBoot`

| Project | Description |
| --- | --- |
| `di` | Dependency injection basics. Prints the bean definitions in the application context and calls a greeting service bean. Console only. |

### `Spring_MVC`

| Project | Description |
| --- | --- |
| `mvc1` | Spring MVC controllers with JSP views: request mappings, path variables, model attributes and a simple employee registration form. |
| `WebbAPPCRM` | Customer CRUD web app using Spring Data JPA (PostgreSQL) with JSP views. |
| `WebbAPPCRMThymleaf` | The same customer CRUD app with Thymeleaf templates instead of JSP. |

### `Spring_Rest`

| Project | Description |
| --- | --- |
| `RestApp1` | `@Controller` + `@ResponseBody` vs `@RestController`, simple greeting and student endpoints. |
| `RestApiUnitTesting` | Greeting/student REST endpoints with a controller unit test (`GreetingControllerTest`). |
| `RestAppActuator` | Student REST endpoints with Spring Boot Actuator. |
| `RestAppXML` | Course endpoints that consume and produce both JSON and XML (Jackson XML). |
| `SpringBootProfiles` | Profile-specific configuration (`dev`, `sit`, `prod` on ports 8081, 8082, 8083; `prod` is active by default). |
| `hateoas` | Course endpoints that return HATEOAS links. |
| `AopExample` | Alien REST API (JPA, PostgreSQL) with `@Before` / `@After` aspects on the controller and service. |
| `TouristBackendApp` | Tourist CRUD REST API (JPA, PostgreSQL) with a custom not-found exception. |
| `TouristBackendGlobalExceptionHandling` | The tourist API with global exception handling via `@RestControllerAdvice`. |
| `BackEndSMProject` | Student management CRUD REST API under `/api` (JPA, MySQL). |
| `SpringMultiDBConfig` | Two data sources in one app: customers in MySQL and products in PostgreSQL. |
| `BatchPApp` | Spring Batch job that imports `customer_data.csv` into the database, started via `GET /import`. |
| `TicketBookingApp/TicketBookingWebApp` | Ticket booking form built with Thymeleaf. |
| `Kafka/PubsApp` | Kafka producer: `POST /addcx` publishes a customer to the `telusko-topic` topic. |
| `Kafka/ApacheKafkaSpringBootConsume` | Kafka consumer that listens on `telusko-topic` (runs on port 8485). |

### `Spring_Security`

| Project | Description |
| --- | --- |
| `SecurityApp1` | Spring Security with HTTP Basic auth and in-memory users. |
| `SecurityApp2` | Stateless Spring Security with HTTP Basic auth; `POST /add-user` saves users with BCrypt-hashed passwords to MySQL via Spring Data JPA. |

### `Spring_Security_App`

| Project | Description |
| --- | --- |
| `demo` | JWT authentication with refresh tokens (`/auth/register`, `/auth/login`, `/auth/refresh`, `/auth/logout`), role-protected `/api` endpoints, Google/GitHub OAuth2 login and Swagger UI (springdoc). Uses PostgreSQL. |

### `practice`

| Project | Description |
| --- | --- |
| `_1` | Plain Java (IntelliJ project, no Maven) examples of `Comparable` and `Comparator`. |

## Prerequisites

- JDK 17 or 21 (check `<java.version>` in the project's `pom.xml`)
- PostgreSQL and/or MySQL for the projects that use a database
- Apache Kafka running on `localhost:9092` for the `Kafka` projects

Maven does not need to be installed separately; each project ships with the Maven wrapper.

## Running a Project

Clone the repository and change into the project you want to run:

```bash
git clone https://github.com/iSouvikKhan/SpringBoot-Hyder-Abbas.git
cd SpringBoot-Hyder-Abbas/Spring_Rest/RestApp1
```

Linux/macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```bat
mvnw.cmd spring-boot:run
```

To run the tests of a project, use `./mvnw test` (or `mvnw.cmd test` on Windows).

### Configuration notes

- Each project's settings are in `src/main/resources/application.properties` (or `application.yml`). Many projects set `server.port=8484`; the others use Spring Boot's default 8080 unless noted above.
- Database-backed projects expect a local database matching the JDBC URL in their configuration (for example `crm`, `springai`, `teluskostudents`, `telusko_db`, `teluskodb` or `security`). Update the URL, username and password to match your local setup. Tables are created automatically (`ddl-auto=update`).
- `BatchPApp` points to a PostgreSQL URL but its `pom.xml` only includes the MySQL driver, so either add the PostgreSQL driver or switch the URL to MySQL before running it. It reads the CSV from `src/main/resources/customer_data.csv`, so run it from the project folder.
- `Spring_Security_App/demo` needs the `jwt.secret` property and, for OAuth2 login, real Google/GitHub client IDs and secrets in `application.yml` (the committed client IDs are placeholders).
