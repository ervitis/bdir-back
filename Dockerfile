FROM openjdk:jre-alpine

WORKDIR /app

ENV VERSION 1.0.0
ENV SCALA_VERSION 2.12

ADD target/scala-${SCALA_VERSION}/bdir-back-assembly-${VERSION}.jar ./app.jar

EXPOSE 80

CMD ["java", "-jar", "app.jar"]