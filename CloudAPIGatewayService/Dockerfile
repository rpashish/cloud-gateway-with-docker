FROM openjdk:17-alpine
COPY target/*.jar CloudAPIGatewayService.jar
EXPOSE 9002
ENTRYPOINT ["java", "-jar", "CloudAPIGatewayService.jar"]