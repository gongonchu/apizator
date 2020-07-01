FROM gcr.io/distroless/java:11

WORKDIR /app

COPY target/jmeter/testFiles jmeter/testFiles

COPY target/apizator-*.jar app.jar

CMD ["-jar", "/app/app.jar"]
EXPOSE 8080
