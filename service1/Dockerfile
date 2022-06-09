FROM openjdk:17-jdk-alpine
WORKDIR /service1
COPY . /service1
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/service1/app.jar"]