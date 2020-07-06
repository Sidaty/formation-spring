#### Clone source code from github by Git

FROM alpine/git as source

MAINTAINER Sidaty

WORKDIR /src

RUN git clone https://github.com/Sidaty/formation-spring.git

### Build and package source to jar file

FROM maven:3.6.3-jdk-8 as build

COPY --from=source /src/formation-spring /src

WORKDIR /src

RUN mvn package

#### Finale Image

FROM openjdk:8

COPY --from=build /src/target/*.jar /app.jar

CMD ["java", "-jar", "/app.jar"]



