FROM openjdk:8-jre
ENV APP_VERSION 1.0-SNAPSHOT
RUN mkdir /app
WORKDIR /app
COPY srpingboot_admin_test-$APP_VERSION.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]
EXPOSE 8889