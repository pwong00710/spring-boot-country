FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ADD /maven/spring-boot-country-0.0.1-SNAPSHOT.jar /spring-boot-country-SNAPSHOT.jar
RUN sh -c 'touch /sfg-thymeleaf-course.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-country-SNAPSHOT.jar"]
