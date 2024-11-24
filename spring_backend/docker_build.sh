#!/bin/bash

mvn clean
mvn package -DskipTests

docker build -t gcr.io/visionapp-442323/visionapp .
docker push gcr.io/visionapp-442323/visionapp

gcloud run deploy visionapp --image gcr.io/visionapp-442323/visionapp --platform managed