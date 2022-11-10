FROM openjdk:17-jdk-alpine

VOLUME /tmp

ADD target/demo1-0.0.1-SNAPSHOT.jar demo1-0.0.1-SNAPSHOT.jar

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /demo1-0.0.1-SNAPSHOT.jar" ]