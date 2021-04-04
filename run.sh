#!/bin/bash
cd frontend-app
yarn install
yarn build
cd ../
cd api-client
mvn clean install
cd ../
mvn clean package
mvn spring-boot:run