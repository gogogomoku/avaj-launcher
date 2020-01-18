# Test: Java 7 compatibility
FROM openjdk:7-jdk-alpine3.7

RUN apk update && apk update && apk add git
RUN mkdir /app
WORKDIR /app
COPY . .

# TODO: decide input file
RUN find . -name "*.java" > sources.txt && javac @sources.txt && java Main "./resources/scenario_simple-1.txt"