FROM openjdk:8
EXPOSE 8080
ADD target/form-0.0.1-SNAPSHOT.jar java-docker-form.jar
ENTRYPOINT ["java","-jar","/java-docker-form.jar"]