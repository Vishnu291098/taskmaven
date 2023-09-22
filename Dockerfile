FROM eclipse-temurin:17
COPY target/EmployeesController.jar  EmployeesController.jar
CMD [ "java","-jar","EmployeesController.jar" ]