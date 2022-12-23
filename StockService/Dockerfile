FROM openjdk:17-alpine
COPY target/*.jar StockService.jar
EXPOSE 9002
ENTRYPOINT ["java", "-jar", "StockService.jar"]
