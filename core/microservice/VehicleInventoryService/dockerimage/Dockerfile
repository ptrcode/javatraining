FROM java:8
MAINTAINER Shyam.Bolisetti@gmail.com
VOLUME /tmp
EXPOSE 8082
ADD vehicleinventory-service-1.1.0.RELEASE.jar vehicleinventory-service-1.1.0.RELEASE.jar
RUN sh -c 'touch vehicleinventory-service-1.1.0.RELEASE.jar'
ENTRYPOINT ["java","-jar","vehicleinventory-service-1.1.0.RELEASE.jar"]


