# 🚀 Monolithic Quiz Application (Spring Boot)

## 📌 Overview

This project is a **monolithic Quiz Application** built using **Spring Boot**, designed to manage quiz creation, question handling, and answer submission within a single unified backend system.

It demonstrates core backend development concepts including **REST API design, layered architecture, and database integration**.

---

## 🧩 Key Features

* Create and manage quiz questions
* Retrieve questions by category
* Generate quizzes dynamically
* Submit quiz answers and evaluate responses
* Fetch quiz results
* RESTful API-based architecture

---

## 🏗 Architecture

This application follows a **monolithic architecture**, where all components (Controller, Service, Repository, and Database) are tightly integrated within a single codebase.

### Layers:

* **Controller Layer** → Handles HTTP requests
* **Service Layer** → Contains business logic
* **Repository Layer** → Handles database operations
* **Database Layer** → Stores quiz & question data

---

## ⚙️ Tech Stack

* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **Maven**
* **MySQL / PostgreSQL**
* **REST APIs**
* **Postman (for API testing)**

---

## 🗂 Project Structure

```bash
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 └── resources/
```

---

## ▶️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Shrivastav0yash/Monolithic-Quiz-App-Spring-boot
cd Monolithic-Quiz-App-Spring-boot
```

### 2. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/questiondb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

### Question APIs

* `GET /question/allQuestions` → Get all questions
* `GET /question/category/{category}` → Get questions by category
* `POST /question/add` → Add new question

### Quiz APIs

* `POST /quiz/create` → Create quiz
* `GET /quiz/get/{id}` → Get quiz
* `POST /quiz/submit/{quizId}` → Submit answers

---

## 🧪 Testing

* Tested using **Postman collections**
* Supports full CRUD operations for questions and quizzes

---

## 🎯 Learning Outcomes

* Understanding of **Monolithic Architecture**
* Building **REST APIs using Spring Boot**
* Working with **Relational Databases using JPA**
* Structuring backend projects using layered design

---

## 🔮 Future Improvements

* Convert into **Microservices Architecture**
* Add **Authentication & Authorization (JWT)**
* Implement **API Gateway & Service Discovery**
* Add **Docker support**
* Improve scalability and fault isolation

---

## 📌 About

This project serves as a foundational backend system for quiz applications and demonstrates how a monolithic system can be structured before transitioning to microservices.

---
