
From openjdk:8
Expose 9090
Add /target/my-spring-boot-web-aws-exe.jar my-spring-boot-web-aws-exe.jar
ENTRYPOINT  ["java","-jar","/my-spring-boot-web-aws-exe.jar"]
