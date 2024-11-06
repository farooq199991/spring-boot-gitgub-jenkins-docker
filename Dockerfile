FROM openjdk:17

EXPOSE 8080

ADD target/spring-boot-gitgub-jenkins-docker.jar spring-boot-gitgub-jenkins-docker.jar

ENTRYPOINT ["java","-jar","spring-boot-gitgub-jenkins-docker.jar"]