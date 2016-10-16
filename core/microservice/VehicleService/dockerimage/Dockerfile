FROM java:8
MAINTAINER Shyam.Bolisetti@gmail.com
VOLUME /tmp
EXPOSE 8083
ADD VehicleService-0.0.1-SNAPSHOT.jar VehicleService-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /VehicleService-0.0.1-SNAPSHOT.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","VehicleService-0.0.1-SNAPSHOT.jar"]
CMD ["java","-jar","VehicleService-0.0.1-SNAPSHOT.jar"]
