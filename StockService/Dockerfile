FROM openjdk:17-alpine
COPY target/*.jar StockService.jar
ENV JAVA_OPTS=""
EXPOSE 9002
ENTRYPOINT ["java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom", "-jar", "StockService.jar"]