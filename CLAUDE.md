# mas-diagnostics-services

## What it is

Backend service for vehicle diagnostics in the MAS application.

## Tech stack

- Java
- Gradle
- Spring Boot
- Spring Web
- Spring Validation
- Spring Boot Actuator
- JUnit Jupiter
- Mockito

## Project structure

```
project/                                      # packages: pl.es8it.mas.diagnostics.<layer>
├── application/                              # data, port/in, port/out, service
├── domain/                                   # event, exception, model, predicate, repository, service
└── infrastructure/                           # adapter/<technology> (e.g. rabbitmq, rest), config
```

## Code style

- Dependencies point inwards: `infrastructure` → `application` → `domain`.
- Use Spring and contract DTOs only in `infrastructure`.
- Use `domain/repository` to load and save the model, `application/port/out` for any other output.
- Classes in `application/service` implement `application/port/in`.
- Name `application/data` classes `...Input` and `...Output`.
- Write unit tests only for application logic, without Spring.
- Use BDDMockito for mocks in tests.
- Do not write comments in code, except `// TODO:`.
- Do not concatenate strings with `+`.
- Do not hard-code values that a contract or configuration provides.
- Prefer the simplest solution that works.
- Never remove requirements or dependencies without asking.

## Key commands

```bash
./gradlew build
./gradlew :application:test
./gradlew :infrastructure:bootRun
```

## Workflow

Stop only for commit message approval; then commit and continue automatically.

1. The user provides the requirements.
2. Red: write compiling but failing tests of the application logic for the next requirement.
3. Propose a commit message.
4. Green: make the tests pass.
5. Refactor with all tests green.
6. Propose a commit message.
7. Implement the adapters in `infrastructure`.
8. Ensure `./gradlew build` passes.
9. Add every repeating pattern to this file.
10. Propose a commit message.
11. Repeat from 2 until all requirements are done.

## Git

- Commit messages follow `[<ticket>] <short description>`.
- Never commit without an approved commit message.
- Never push.

## Do not touch
