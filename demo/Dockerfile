# Use Eclipse Temurin Java 17 as base (matches Spring Boot build)
FROM eclipse-temurin:17-jdk

# Set a working directory
WORKDIR /app

# Copy the jar file from target directory to the container
COPY target/*.jar app.jar

# Expose port (same as Spring Boot's server.port)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
