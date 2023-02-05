./gradlew clean build
docker build . -t ascjke/cats-api:1.0.0
docker push ascjke/cats-api:1.0.0