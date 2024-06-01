FROM openjdk:17-slim
WORKDIR /app
COPY target/demo-JPA-Hibernate-0.0.1-SNAPSHOT.jar /app/demo-JPA-Hibernate-0.0.1-SNAPSHOT.jar
EXPOSE 6000
CMD ["java", "-jar", "demo-JPA-Hibernate-0.0.1-SNAPSHOT.jar"]
