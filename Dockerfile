FROM openjdk:8
ADD target/SpringBootDemo-0.0.1-SNAPSHOT.jar SpringBootDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "SpringBootDemo-0.0.1-SNAPSHOT.jar"]