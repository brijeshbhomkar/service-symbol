#FROM alpine/git as clone
FROM alpine:3.5
RUN apk update
RUN apk add --no-cache git
CMD ["git","--version"]
ENV URL https://github.com/brijeshbhomkar/service-symbol.git
WORKDIR /app
RUN git clone https://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:x-oauth-basic@github.com/brijeshbhomkar/service-symbol.git

FROM maven:3.5-jdk-8-alpine as build
ENV PROJECT service-symbol
WORKDIR /app
COPY --from=0 /app/service-symbol /app
RUN mvn install

FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8082
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD /app/target/service-symbol.jar /app/service-symbol.jar
ENTRYPOINT ["java", "-jar", "/app/service-symbol.jar"]