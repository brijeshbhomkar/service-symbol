FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/service-symbol-0.0.1-SNAPSHOT.jar /app/service-symbol.jar
ENTRYPOINT ["java", "-jar", "/app/service-symbol.jar"]
