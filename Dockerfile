FROM openjdk:8
ADD CalcApp/target/CalcApp-0.0.1-SNAPSHOT.jar CalcApp-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","CalcApp-0.0.1-SNAPSHOT.jar"]

