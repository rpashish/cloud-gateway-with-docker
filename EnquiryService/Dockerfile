FROM openjdk:17-alpine
COPY target/*.jar EnquiryService.jar
EXPOSE 9002
ENTRYPOINT ["java", "-jar", "EnquiryService.jar"]
