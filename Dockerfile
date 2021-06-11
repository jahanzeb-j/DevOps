# Maven build container
FROM maven:3.6.3-openjdk-11 AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk

#maintainer
MAINTAINER dstar55@yahoo.com
#expose port 9090
EXPOSE 9090

#default command
CMD java -jar /data/devops-0.0.1-SNAPSHOT.war

#copy war to docker image from builder image
COPY --from=maven_build /tmp/target/devops-0.0.1-SNAPSHOT.war /data/devops-0.0.1-SNAPSHOT.war