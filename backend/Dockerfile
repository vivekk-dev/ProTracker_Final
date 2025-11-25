FROM eclipse-temurin:17-jdk

# Install PostgreSQL client so pg_isready works
RUN apt-get update && apt-get install -y postgresql-client && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Copy the JAR from Maven build
COPY target/*.jar app.jar

COPY wait-for-postgres.sh /app/wait-for-postgres.sh
RUN chmod +x /app/wait-for-postgres.sh

EXPOSE 8080

ENTRYPOINT ["/app/wait-for-postgres.sh", "postgres", "java", "-jar", "app.jar"]
