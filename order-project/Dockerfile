FROM gradle:8.6.0-jdk17 as builder
WORKDIR /build

# 그래들 파일이 변경되었을 때만 새롭게 의존패키지 다운로드 받게함.
COPY gradlew .
COPY gradle gradle
RUN chmod +x ./gradlew

# 소스 코드 및 빌드 스크립트 복사
COPY build.gradle settings.gradle ./
COPY src src

RUN ./gradlew bootJar

# APP
FROM openjdk:17.0-slim
WORKDIR /app

# 빌더 이미지에서 jar 파일만 복사
COPY --from=builder /build/build/libs/order-project-0.0.1-SNAPSHOT.jar .
EXPOSE 8081

ENTRYPOINT [                                                \
    "java",                                                 \
    "-jar",                                                 \
    "order-project-0.0.1-SNAPSHOT.jar"              \
]