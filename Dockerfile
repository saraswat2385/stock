FROM openjdk:8-jre-alpine
COPY /build/libs/stock-1.0.0.jar /opt/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/stock-1.0.0.jar"]
EXPOSE 8080