# BoulderTrail - Spring Boot Application
### Overview
This is the BoulderTrail application developed as a take-home assignment. 
The application is built with Spring Boot and integrated with PostgreSQL. 
It allows users to search between a list of trails using some filter criterias. 
The application has been containerized using Docker and can be deployed on an AWS EC2 instance.

### Technologies
Java 17
Spring Boot 3.3.4
Spring Data JPA
PostgreSQL 16.3
jQuery datatable to show the list of data
Bootstrap for styling
Docker for containerization

### Local Setup
Create the database manually using create-database.sql script located in src/main/resources/db/create-database.sql
It will add some dummy data for the test cases.
Update the application.properties file with local database configurations:
for example:
spring.datasource.url=jdbc:postgresql://localhost:5432/trail_db
spring.datasource.username=your_username
spring.datasource.password=your_password

### Database Initialization
The database is initialized through src/main/resources/db/create-database.sql, which runs when Docker containers start for the first time.

### Docker Setup
The project includes a docker-compose.yml file to run both the application and the database within Docker containers.

### Database Design Overview
I used the provided CSV file in the Git repository (sap-eb-take-home-problem). 
As an example, I separated two entities, created separate tables for them, and connected them using a foreign key, so they are ready for future developments.

### Update Database Versioning
Using the update-database.sql script located in src/main/resources/db/update-database.sql, developers can make changes to the database and keep track of those changes. 
The script runs every time the application starts. The version number should now be increased manually.

### Future Enhancements
1-Implement better security practices for handling credentials (e.g., using AWS Secrets Manager or .env files)
2-Dynamic Data for Dropdowns: Currently, the data in dropdowns is hardcoded. This can be enhanced by populating dropdowns dynamically with real data fetched from the related database tables.
3-Accurate Database Design: Refine the database schema for better normalization and relationships among entities.
4-User Interface Improvements: Enhance the UI for better user experience and responsiveness. Now it's the simplest way possible.
5-Performance Optimization: In cases of large data sets, enable server-side processing and pagination to improve efficiency.
6-Improve the database versioning strategy
