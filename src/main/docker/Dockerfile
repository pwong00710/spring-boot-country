FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
RUN mkdir /app
ADD spring-boot-country-0.0.1-SNAPSHOT.jar /app/app.jar
RUN sh -c 'touch /app/app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]
