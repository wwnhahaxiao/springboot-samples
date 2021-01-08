1. mkdir test
2. cd test
3. touch Dockerfile  
FROM openjdk:8-jdk-alpine  
COPY docker-samples-0.0.1-SNAPSHOT.jar docker-samples-0.0.1-SNAPSHOT.jar  
ENTRYPOINT ["java","-jar","/docker-samples-0.0.1-SNAPSHOT.jar"]  
4. docker build -t roshan:1.0 .
5. docker run -dit -p 6666:6666 roshan:1.0