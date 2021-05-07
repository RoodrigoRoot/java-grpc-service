#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY . .

RUN mvn -f ./pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY . .
COPY grpcServer.jar grpcServer.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","grpcServer.jar"]