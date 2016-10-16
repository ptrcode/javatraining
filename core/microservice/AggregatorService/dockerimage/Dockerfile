FROM java:8
MAINTAINER Shyam.Bolisetti@gmail.com
VOLUME /tmp
EXPOSE 8089
ADD AggregatorService-1.0-SNAPSHOT.jar AggregatorService-1.0-SNAPSHOT.jar
RUN sh -c 'touch /AggregatorService-1.0-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","AggregatorService-1.0-SNAPSHOT.jar"]
#CMD ["java -Djava.security.egd=file:/dev/./urandom -jar AggregatorService-1.0-SNAPSHOT.jar]
