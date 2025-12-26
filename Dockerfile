FROM eclipse-temurin:17-jdk-jammy

WORKDIR /usr/src/application
COPY . .

RUN chmod +x gradlew

ENTRYPOINT ["./gradlew", "bootRun"]
