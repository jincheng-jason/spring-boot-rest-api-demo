#Front build stage
FROM node:12.18.1 AS frontBuild
RUN apt-get install -y curl \
  && curl -L https://www.npmjs.com/install.sh | sh
COPY frontend-app/src /home/app/frontend-app/src
COPY frontend-app/public /home/app/frontend-app/public
COPY frontend-app/package.json /home/app/frontend-app/
COPY src /home/app/src
RUN yarn --cwd "/home/app/frontend-app" install
RUN yarn --cwd "/home/app/frontend-app" build

#Backend build stage
FROM maven:3.6.0-jdk-8 AS backBuild
COPY src /home/app/src
COPY pom.xml /home/app/
COPY api-client/src /home/app/api-client/src
COPY api-client/pom.xml /home/app/api-client/
RUN mvn -f /home/app/api-client/pom.xml clean install
COPY --from=frontBuild /home/app/src/main/resources/static /home/app/src/main/resources/static
RUN mvn -f /home/app/pom.xml clean package

# Package stage
FROM openjdk:8-jdk-alpine
COPY --from=backBuild /home/app/target/spring-boot-rest-api-demo-1.0.0-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/demo.jar"]
