FROM openjdk:17-jdk-alpine
WORKDIR /service2
COPY . /service2
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/service2/app.jar"]