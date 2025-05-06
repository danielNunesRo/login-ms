FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/login-0.0.1-SNAPSHOT.jar /app/login-api.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/login-api.jar"]
