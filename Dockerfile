FROM eclipse-temurin:21-jdk-jammy

WORKDIR /usr/src/application
COPY . .

RUN chmod +x gradlew

ENTRYPOINT ["./gradlew", "bootRun"]
