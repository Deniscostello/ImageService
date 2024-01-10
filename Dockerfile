FROM openjdk:17-jdk-alpine
ENV PROFILE=docker
WORKDIR /app
COPY target/CiCd-Project-ImageService-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "CiCd-Project-ImageService-0.0.1-SNAPSHOT.jar"]