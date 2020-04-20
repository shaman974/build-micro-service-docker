FROM java:8
VOLUME /workspace/app
EXPOSE 8080
ADD build/libs/build-micro-service-docker-0.0.1-SNAPSHOT.jar /build.jar
ENTRYPOINT ["java","-jar","/build.jar"]