# Use JDK to build/run the JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the JAR file (change name if necessary)
COPY target/*.jar app.jar

EXPOSE 8080

COPY wait-for-postgres.sh /app/wait-for-postgres.sh
RUN chmod +x /app/wait-for-postgres.sh

ENTRYPOINT ["/app/wait-for-postgres.sh", "postgres", "java", "-jar", "app.jar"]