FROM alpine:3.17.1

RUN apk add openjdk17

COPY build/libs/cats-api.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

