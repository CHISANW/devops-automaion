FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/devops-study-0.0.1-SNAPSHOT.jar /app/devops-study.jar

ENTRYPOINT ["java", "-jar","devops-study.jar"]