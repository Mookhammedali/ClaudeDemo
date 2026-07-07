    # CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

A Spring Boot 4.1.0 web application (Gradle, Java 21). Base package: `io.munkush.app`. This is currently a freshly-generated skeleton (Spring Initializr output) with no controllers, services, or endpoints yet — just the application entry point.

## Commands

Use the Gradle wrapper (`./gradlew`), not a system-installed Gradle.

- Build: `./gradlew build`
- Run the app: `./gradlew bootRun`
- Run all tests: `./gradlew test`
- Run a single test class: `./gradlew test --tests "io.munkush.app.ClaudeDemoApplicationTests"`
- Run a single test method: `./gradlew test --tests "io.munkush.app.ClaudeDemoApplicationTests.contextLoads"`

## Architecture

- `src/main/java/io/munkush/app/ClaudeDemoApplication.java` — `@SpringBootApplication` entry point.
- `src/main/resources/application.properties` — Spring configuration (currently only sets `spring.application.name`).
- `src/test/java/io/munkush/app/` — tests, using `@SpringBootTest` + JUnit 5 (via `junit-platform-launcher`).
- Dependencies use `spring-boot-starter-webmvc` (Spring MVC) and Lombok (compile-only + annotation processor) for both main and test source sets.

As the codebase grows, place new components under `io.munkush.app` following standard Spring layering (e.g. `controller`, `service`, `repository` packages) since none exist yet.