FROM java:8
VOLUME /tmp
EXPOSE 8080
WORKDIR /workspace/app
COPY gradle gradle
COPY gradlew .
COPY settings.gradle.kts .
COPY build.gradle.kts .
COPY src src

RUN pwd
RUN ./gradlew clean build
RUN ls
ENTRYPOINT ["java","-jar","/workspace/app/build/libs/build-micro-service-docker-0.0.1-SNAPSHOT.jar"]