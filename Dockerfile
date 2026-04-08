# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Stage 2: Create the runtime image
# Changed from openjdk:17-jdk-slim to eclipse-temurin:17-jre-alpine
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/simple-java-app-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]