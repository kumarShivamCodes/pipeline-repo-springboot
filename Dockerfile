# Use a lightweight base image for running the Spring Boot app with Java 21
FROM eclipse-temurin:21-jre-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the pre-built JAR file from the target directory to the container
# (Make sure your Maven build places the JAR file in target/your-app.jar)
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (or the port your Spring Boot app uses)
EXPOSE 8081

# Define the command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
