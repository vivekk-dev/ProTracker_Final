# Use JDK to build/run the JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the JAR file (change name if necessary)
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
