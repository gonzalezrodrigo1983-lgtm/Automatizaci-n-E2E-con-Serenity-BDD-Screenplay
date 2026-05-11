# Desafío Técnico - Automatización E2E con Serenity BDD Screenplay

## Objetivo
Automatizar un flujo E2E de autenticación sobre una URL pública de práctica QA:

- URL base: `https://the-internet.herokuapp.com/login`
- Flujo positivo: login exitoso con credenciales válidas.
- Flujo negativo: validación de usuario/contraseña inválida.

## Stack técnico
- Java 17
- Maven 3.9.1 compatible
- Serenity BDD + Screenplay
- Cucumber / Gherkin
- Datos parametrizados en JSON

## Estructura relevante
```text
src/test/resources/features/login_e2e.feature
src/test/resources/data/login-users.json
src/test/java/com/bancaecuador/e2e
```

## Ejecutar pruebas
```bash
mvn clean verify
```

Para ejecutar en modo visible:
```bash
mvn clean verify -Dheadless.mode=false
```

## Reportes generados
- Serenity HTML: `target/site/serenity/index.html`
- Cucumber JSON: `target/cucumber-reports/e2e-cucumber.json`
- Cucumber HTML: `target/cucumber-reports/e2e-cucumber-html/index.html`

## Observaciones QA
Los datos de prueba están desacoplados en `login-users.json`, permitiendo mantener credenciales y resultados esperados sin modificar el feature ni el código Java.
# desafio-e2e-serenity-screenplay
# desafio-e2e-serenity-screenplay
# desafio-performance-jmeter
# desafio-performance-jmeter
# desafio-e2e-serenity-screenplay
# desafio-e2e-serenity-screenplay
