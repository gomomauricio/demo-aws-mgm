FROM eclipse-temurin:21-jre-alpine
COPY target/*.jar demo-aws-mgm-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/demo-aws-mgm-0.0.1-SNAPSHOT.jar"]