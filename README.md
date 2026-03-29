# 🚀 Task Manager API (Spring Boot + Docker)

## 📌 Description
Task Manager API is a backend system to manage user details. It provides full **CRUD functionality** (Create, Read, Update, Delete) using **Spring Boot** and **MySQL**.

The project is fully **containerized using Docker and Docker Compose**, enabling easy setup and consistent deployment.

---

## 🛠️ Technologies
- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- MySQL  
- Docker & Docker Compose  
- REST API  

---

## ⚙️ Features
- Add new user – `POST /api/users/upload`
- Get user by registration number – `GET /api/users/{registrationNo}`
- Get all users – `GET /api/users`
- Update user – `PUT /api/users/{registrationNo}`
- Delete user – `DELETE /api/users/{registrationNo}`

---

## 📁 Folder Structure

task-manager-api/
├── src/
│ └── main/
│ ├── java/code/rajnish/task_maneger/task_maneger/
│ │ ├── controller/UserController.java
│ │ ├── model/UserDetails.java
│ │ ├── repository/UserRepository.java
│ │ └── service/UserService.java
│ └── resources/
│ ├── application.properties
│
├── Dockerfile
├── docker-compose.yml
├── .dockerignore
├── pom.xml
└── README.md

⚙️ application.properties (Docker)
spring.datasource.url=jdbc:mysql://mysql:3306/taskdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

| Method | Endpoint                      | Description    |
| ------ | ----------------------------- | -------------- |
| GET    | `/api/users`                  | Get all users  |
| GET    | `/api/users/{registrationNo}` | Get user by ID |
| POST   | `/api/users/upload`           | Create user    |
| PUT    | `/api/users/{registrationNo}` | Update user    |
| DELETE | `/api/users/{registrationNo}` | Delete user    |

---

## 🐳 Run with Docker (Recommended)

### ▶️ Start Application
```bash
docker compose up --build
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
🚧 Challenges Faced
Maven dependency resolution issues
Java version mismatch (17 vs 21)
Docker networking & DB connection timing
Build failures due to network interruptions
👨‍💻 Author

Rajnish Shiv
