FROM openjdk:11
LABEL maintainer="edix.calrlos.com"
ADD target/api-h2-0.0.1-SNAPSHOT.jar springboot-docker-api-h2.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-api-h2.jar"]