# back
FROM openjdk:8-jdk-alpine

LABEL maintainer="2262288@gmail.com"
VOLUME /tmp

EXPOSE 8082

ARG JAR_FILE=build/libs/rosbank-algorythm-0.0.1.jar
ADD ${JAR_FILE} rosbank-algo.jar
ENTRYPOINT ["java","-jar","/rosbank-algo.jar"]
