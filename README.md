# microservices

Spring Boot Microservices

Dependencies Used: Spring Boot Core & Spring Web

By Default, Application runs on port 8080. Customized Ports are specified in application.properties file under respective project.

Controllers are placed under the respective package.

use maven wrapper .mvnw.cmd or corresponding file respective to your operating system and do clean package.

---------------------------------------------------------------------------------------------------------------------------------------

DOCKER:

Dockerfile - with all the necessary instructions are provided.

Just run the below command to build docker image:
docker build -t $app-name:$version .

This will build the docker image.

----------------------------------------------------------------------------------------------------------------------------------------

KUBERNETES:

Refer to corresponding .yml file, which helps to deploy in Kubernetes cluster locally using Minikube.

Command to deploy the app in Kubernetes Cluster: kubectl apply -f $filename



