FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY ./target/SpringBootAppECSDemo.jar /app
EXPOSE 8080
CMD ["java","-jar","SpringBootAppECSDemo.jar"]
