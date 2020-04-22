FROM openjdk:8-jdk-alpine

COPY ./target/zuul-proxy-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "/app.jar"]