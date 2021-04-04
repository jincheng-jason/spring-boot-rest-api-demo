#!/bin/bash
cd frontend-app
yarn install
yarn build
cd ../
mvn clean install
mvn spring-boot:run