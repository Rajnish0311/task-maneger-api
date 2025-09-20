# Task Manager API

**Technologies:** Java, Spring Boot, MySQL, JPA, REST API

---

## Description
Task Manager API is a backend system to manage user details. It provides full **CRUD functionality** (Create, Read, Update, Delete) for user records using a MySQL database.

---

## Features
- Add new user – `POST /api/users/upload`
- Get user by registration number – `GET /api/users/{registrationNo}`
- Get all users – `GET /api/users`
- Update user – `PUT /api/users/{registrationNo}`
- Delete user – `DELETE /api/users/{registrationNo}`

---

## Folder Structure

task-manager-api/
├── src/
│ └── main/
│ ├── java/code/rajnish/task_manager/task_manager/
│ │ ├── controller/UserController.java
│ │ ├── model/UserDetails.java
│ │ ├── repository/UserRepository.java
│ │ └── service/UserService.java
│ └── resources/
│ ├── application.properties
│ └── data.sql (optional)
├── .gitignore
├── pom.xml
└── README.md 
## application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/task_manager_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


---

## data.sql (optional)

INSERT INTO user_details (registration_no, name, email, college_id, code)
VALUES ('67819', 'Chandu Dehariya', 'chandui69@gmail.com', 'UIT130', 'ABC326');


---

## How to Run

1. Install Java, Maven, and MySQL.
2. Create a database in MySQL and update credentials in `application.properties`.
3. Run the project:
mvn spring-boot:run

4. Test the API using Postman or any HTTP client.

---

## Sample API Response

```json
{
    "status": "success",
    "data": {
        "name": "Chandu Dehariya",
        "email": "chandui69@gmail.com",
        "collegeId": "UIT130",
        "registrationNo": "67819",
        "code": "ABC326"
    },
    "message": "User uploaded successfully!"
}


