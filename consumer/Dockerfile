FROM openjdk:8
EXPOSE 8080
ADD target/consumer-0.0.1-SNAPSHOT.war  consumer-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/consumer-0.0.1-SNAPSHOT.war" ]
