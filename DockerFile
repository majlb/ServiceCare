# Use a lightweight JDK image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory in container
WORKDIR /app

# Copy all files into the container
COPY . .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Build the application (skip tests if needed)
RUN ./mvnw clean package -DskipTests

# Expose Spring Boot's default port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/*.jar"]
