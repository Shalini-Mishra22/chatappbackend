FROM openjdk:17-jdk-slim


WORKDIR /Chat

COPY target/chatappbackend-0.0.1-SNAPSHOT.jar Chat.jar
EXPOSE 8080
CMD ["java","-jar","Chat.jar"]