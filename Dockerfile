FROM openjdk:11-jre-slim
VOLUME /tmp
COPY target/myopenshift-0.0.1-SNAPSHOT.jar myopenshift-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/myopenshift-0.0.1-SNAPSHOT.jar"]
