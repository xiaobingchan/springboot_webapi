FROM openjdk:21
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
USER APP
EXPOSE 8088
CMD ["java", "-jar" ,"app.jar"]
