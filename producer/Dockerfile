FROM openjdk:8
EXPOSE 8080
ADD target/producer-0.0.1-SNAPSHOT.war  producer-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/producer-0.0.1-SNAPSHOT.war" ]
