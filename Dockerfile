FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/spring-tutorial.jar
RUN  echo HI ${JAR_FILE}
COPY ${JAR_FILE} spring-tutorial.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-tutorial.jar"]