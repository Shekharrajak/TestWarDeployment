# Use an official  runtime as a parent image
FROM java:8-jre
# FROM maven

# Set the working directory to /app
# WORKDIR /workflowte

# Copy the current directory contents into the container at /app
# ADD . /workflowte
ADD target/test.jar target/test.jar

# Make port 80 available to the world outside this container
EXPOSE 8121

# Run app.py when the container launches
# CMD ["mvn", "spring-boot:run"]
# RUN ["mvn", "clean", "package","-DskipTests"]
CMD ["java", "-jar", "target/test.jar"]
