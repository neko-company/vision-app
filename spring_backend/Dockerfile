# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Copy the JAR file from the target folder
COPY target/visionapp-0.0.1-SNAPSHOT.jar /app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
