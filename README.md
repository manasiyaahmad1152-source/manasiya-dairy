# Manasiya Dairy Management System

Full Stack Java mini project.

## Technology
- Java 17
- Spring Boot 3.5
- Spring Data JPA
- MySQL
- HTML/CSS/JavaScript

## Run
1. Install JDK 17+ and Maven.
2. Install MySQL and make sure the MySQL server is running.
3. Open `src/main/resources/application.properties`.
4. Replace `YOUR_MYSQL_PASSWORD` with your MySQL root password.
5. From the project folder run:
   `mvn spring-boot:run`
6. Open:
   `http://localhost:8080`

The first version includes Dashboard, Customers CRUD, Milk Entry, Monthly Bill UI and Reports placeholder. Customer/milk data also has a browser-local fallback so the UI can be demonstrated before database setup.

## Suggested next phase
- Persist milk entries with a JPA entity and REST API
- Authentication/login
- Payment status
- Date-range reports
- PDF bill generation
