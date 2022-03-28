
From openjdk:8
Expose 8095
Add /target/my-spring-boot-web-aws-exe.jar my-spring-boot-web-aws-exe.jar
ENTRYPOINT  ["java","-jar","/my-spring-boot-web-aws-exe.jar"]
