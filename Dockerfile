ARG DOCKER_REGISTRY=registry.redhat.io
FROM registry.redhat.io/openjdk/openjdk-11-rhel7
COPY target/*.jar deploy-test.jar
ENTRYPOINT java -jar deploy-test.jar
EXPOSE 8080