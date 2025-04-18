FROM eclipse-temurin:23-jdk-noble

WORKDIR /app

COPY build/libs/your-app-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
