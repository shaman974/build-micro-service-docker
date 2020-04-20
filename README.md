# Création Image à partir d'un projet

## Création d'une image à partir d'un build

Build lancé avant la création et création d'une image à partir d'un build

```
./gradlew clean build

docker build -t perso-test-build-lance -f src/docker/image-avec-build-deja-lance/Dockerfile .

docker run -d -p 8080:8080 perso-test-build-lance

curl http://localhost:8080/actuator/info
```

## Création d'une image avec build du jar dans l'image

```
docker build -t perso-test-build-avec-image -f src/docker/image-avec-build-creation/Dockerfile .
docker run -d -p 8080:8080 perso-test-build-avec-image
```

## Image pour builder le source

```
mkdir resultat
docker build -t perso-test-build1 -f src/docker/build-gradle/Dockerfile .
docker run -v $PWD/resultat:/workspace/app/build perso-test-build1
```

## Lien

https://spring.io/guides/gs/spring-boot-docker/

https://spring.io/guides/topicals/spring-boot-docker/

https://docs.docker.com/develop/develop-images/dockerfile_best-practices/
