# 🚀 Microservices Quiz Application

A complete Quiz Management System built using Spring Boot Microservices architecture. This project demonstrates modern distributed system concepts such as Service Discovery, API Gateway, Inter-Service Communication, and Database-per-Service architecture.

The application is designed using independent microservices, where each service has a dedicated responsibility and database, ensuring scalability, maintainability, and loose coupling.

---

# 🏗️ Architecture

```text
                           +-------------------+
                           |  Service Registry |
                           |     (Eureka)      |
                           +---------+---------+
                                     |
                          +----------v----------+
                          |     API Gateway     |
                          +----------+----------+
                                     |
                    -----------------------------------
                    |                                 |
          +---------v---------+             +---------v---------+
          | Question Service  |             |   Quiz Service    |
          +---------+---------+             +---------+---------+
                    |                                 |
          +---------v---------+             +---------v---------+
          |   Question DB     |             |      Quiz DB      |
          +-------------------+             +-------------------+
```

---

# 📌 Overview

The Microservices Quiz Application consists of multiple independently deployable services:

* **Service Registry** for service discovery.
* **API Gateway** as the single entry point for all client requests.
* **Question Service** for managing questions.
* **Quiz Service** for creating quizzes and evaluating responses.
* **Separate databases** for each microservice.

All services communicate through the Spring Cloud ecosystem and are registered with Eureka Server.

---

# ✨ Features

## API Gateway

* Single entry point for all client requests.
* Dynamic routing using Eureka Service Discovery.
* Centralized request management.
* Load balancing support.
* Simplified client communication.
* Decouples clients from internal services.

## Question Service

* Create questions.
* Store questions in MySQL database.
* Retrieve questions by category.
* Generate random questions.
* Provide questions to Quiz Service.
* Manage question-related operations independently.

## Quiz Service

* Create quizzes dynamically.
* Generate quizzes based on category and number of questions.
* Fetch questions from Question Service.
* Submit quiz responses.
* Calculate quiz scores.
* Manage quiz-related operations independently.

## Service Registry

* Eureka Server implementation.
* Automatic service registration.
* Service discovery between microservices.
* Centralized service management.

---

# 🛠️ Tech Stack

## Backend

* Java 21
* Spring Boot
* Spring Data JPA
* Spring Web
* Spring Cloud Gateway
* Spring Cloud Netflix Eureka
* Maven

## Database

* MySQL

## Tools

* IntelliJ IDEA
* Git & GitHub
* Postman

---

# 📂 Project Structure

```text
Microservices-Quiz-App-Spring-Boot
│
├── Service Registry
│   └── Eureka Server
│
├── API Gateway
│   └── Spring Cloud Gateway
│
├── Question Service
│   ├── Controller
│   ├── Service
│   ├── Repository
│   ├── Entity
│   └── MySQL Database
│
└── Quiz Service
    ├── Controller
    ├── Service
    ├── Repository
    ├── Entity
    └── MySQL Database
```

---

# 🔄 Application Workflow

### Service Startup

1. Start Service Registry.
2. Start API Gateway.
3. Start Question Service.
4. Start Quiz Service.
5. All services register themselves with Eureka Server.

### Request Flow

1. Client sends request to API Gateway.
2. API Gateway discovers the target service through Eureka.
3. Request is routed to the appropriate microservice.
4. Quiz Service communicates with Question Service whenever questions are required.
5. Response is returned to the client through API Gateway.

### Quiz Creation Flow

1. User requests quiz creation.
2. Quiz Service receives the request.
3. Quiz Service requests questions from Question Service.
4. Question Service returns randomly selected questions.
5. Quiz Service creates and stores the quiz.
6. Quiz information is returned to the user.

### Quiz Submission Flow

1. User submits quiz answers.
2. Quiz Service receives responses.
3. Quiz Service validates answers through Question Service.
4. Score is calculated.
5. Final result is returned to the user.

---

# 🚀 Running the Project

## Clone the Repository

```bash
git clone https://github.com/Shrivastav0yash/Microservices-Quiz-App-Spring-boot.git
```

## Start Services in the Following Order

### 1. Service Registry

Start Eureka Server.

Default URL:

```text
http://localhost:8761
```

### 2. API Gateway

Start the API Gateway service.

### 3. Question Service

Start the Question Service.

### 4. Quiz Service

Start the Quiz Service.

---

# ✅ Verify Service Registration

Open Eureka Dashboard:

```text
http://localhost:8761
```

You should see:

* API-GATEWAY
* QUESTION-SERVICE
* QUIZ-SERVICE

registered successfully.

---

# 📚 Microservices Concepts Implemented

* Microservices Architecture
* API Gateway Pattern
* Service Discovery
* Service Registration
* Database Per Service
* Inter-Service Communication
* Dynamic Routing
* Load Balancing
* Layered Architecture
* Dependency Injection
* RESTful APIs
* Spring Cloud Ecosystem
* JPA & Hibernate

---

# 📦 Service Repositories

## Service Registry

Repository:

https://github.com/Shrivastav0yash/quiz_app_service_registry

## API Gateway

Repository:

https://github.com/Shrivastav0yash/api-gateway

## Question Service

Repository:

https://github.com/Shrivastav0yash/question-service

## Quiz Service

Repository:

https://github.com/Shrivastav0yash/quiz-service

---

# 🔮 Future Enhancements

* OpenFeign Client
* Resilience4j Circuit Breaker
* Config Server
* Docker & Docker Compose
* JWT Authentication
* Centralized Logging
* Distributed Tracing
* Prometheus Monitoring
* Grafana Dashboards
* CI/CD Pipeline using GitHub Actions
* Kubernetes Deployment

---

# 👨‍💻 Author

**Yash Shrivastav**

Java Backend Developer | Spring Boot | Microservices

This project was built to gain hands-on experience with modern Spring Boot Microservices architecture and distributed systems development.
