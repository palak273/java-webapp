FROM openjdk:8
EXPOSE 8080
ADD target/java-docker-form.jar java-docker-form.jar
ENTRYPOINT ["java","-jar","/java-docker-form.jar"]