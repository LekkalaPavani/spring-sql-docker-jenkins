FROM eclipse-temurin:17-jdk-focal
EXPOSE 9098
ADD target/Spring-sql-docker-jen-0.0.1-SNAPSHOT.jar Spring-sql-docker-jen-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Spring-sql-docker-jen-0.0.1-SNAPSHOT.jar"]