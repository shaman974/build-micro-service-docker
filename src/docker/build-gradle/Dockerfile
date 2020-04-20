FROM java:8
VOLUME /workspace/app/build
WORKDIR /workspace/app
COPY gradle gradle
COPY gradlew .
COPY settings.gradle.kts .
COPY build.gradle.kts .
COPY src src

#RUN pwd
#RUN ./gradlew clean build
#RUN ls
ENTRYPOINT ["./gradlew","build"]