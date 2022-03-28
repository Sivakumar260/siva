FROM ubuntu:20.04

FROM openjdk:8u111-jdk-alpine
VOLUME /tmp
ADD /target/my-spring-boot-web-aws-exe.jar
ENTRYPOINT ["java","-jar","/my-spring-boot-web-aws-exe.jar"]

EXPOSE 80
