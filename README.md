# BoulderTrail - Spring Boot Application
### Overview
This is the BoulderTrail application developed as a take-home assignment. <br/>
The application is built with Spring Boot and integrated with PostgreSQL. <br/>
It allows users to search between a list of trails using some filter criterias. <br/>
The application has been containerized using Docker and can be deployed on an AWS EC2 instance. <br/>

### Technologies
Java 17 <br/>
Spring Boot 3.3.4 <br/>
Spring Data JPA <br/>
PostgreSQL 16.3 <br/>
jQuery datatable to show the list of data <br/>
Bootstrap for styling <br/>
Docker for containerization <br/>

### Local Setup
Create the database manually using create-database.sql script located in src/main/resources/db/create-database.sql <br/>
It will add some dummy data for the test cases. <br/>
Update the application.properties file with local database configurations: <br/>
for example: <br/>
spring.datasource.url=jdbc:postgresql://localhost:5432/trail_db <br/>
spring.datasource.username=your_username <br/>
spring.datasource.password=your_password <br/>

### Database Initialization
The database is initialized through src/main/resources/db/create-database.sql, which runs when Docker containers start for the first time. <br/>

### Docker Setup
The project includes a docker-compose.yml file to run both the application and the database within Docker containers. <br/>

### Database Design Overview
I used the provided CSV file in the Git repository (sap-eb-take-home-problem). <br/>
As an example, I separated two entities, created separate tables for them, and connected them using a foreign key, so they are ready for future developments. <br/>

### Update Database Versioning
Using the update-database.sql script located in src/main/resources/db/update-database.sql, developers can make changes to the database and keep track of those changes. <br/>
The script runs every time the application starts. The version number should now be increased manually. <br/>

### Future Enhancements
1-Implement better security practices for handling credentials (e.g., using AWS Secrets Manager or .env files) <br/>
2-Dynamic Data for Dropdowns: Currently, the data in dropdowns is hardcoded. This can be enhanced by populating dropdowns dynamically with real data fetched from the related database tables. <br/>
3-Accurate Database Design: Refine the database schema for better normalization and relationships among entities. <br/>
4-User Interface Improvements: Enhance the UI for better user experience and responsiveness. Now it's the simplest way possible. <br/>
5-Performance Optimization: In cases of large data sets, enable server-side processing and pagination to improve efficiency. <br/>
6-Improve the database versioning strategy <br/>
