# FROM openjdk:8
# EXPOSE 8080
# ADD target/springboot-docker.jar	springboot-docker.jar
# ENTRYPOINT ["java","-jar","/springboot-docker.jar"]

# Use a base Java image
FROM openjdk:14-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory to the container
COPY target/springboot-docker.jar springboot-docker.jar

# Expose the port that the Spring Boot application listens on
EXPOSE 8080

# Define the command to run the Spring Boot application
CMD ["java", "-jar", "springboot-docker.jar"]
