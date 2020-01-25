# Test: Java 7 compatibility
FROM openjdk:7-jdk-alpine3.7

RUN apk update && apk update && apk add git
RUN mkdir /app
WORKDIR /app
COPY . .
ARG inputFile="resources/sujet-scenario.txt"
RUN ls resources/sujet-scenario.txt

RUN sh ./launch.sh ${inputFile}