FROM openjdk:8
COPY ./target/dockerDemo2-0.0.1-SNAPSHOT.jar dockerDemo2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dockerDemo2-0.0.1-SNAPSHOT.jar"]