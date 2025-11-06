# Use official OpenJDK 11 image as base
FROM openjdk:11-jdk-slim

# Set a working directory
WORKDIR /app

# Copy the jar file from target directory to the container
COPY target/*.jar app.jar

# Expose port (same as Spring Boot's server.port)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
