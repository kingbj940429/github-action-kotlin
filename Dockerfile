FROM gradle:7.5.1-jdk11 AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src

RUN gradle build --no-daemon

FROM azul/zulu-openjdk:11-latest
EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java", "-jar","/app/spring-boot-application.jar"]