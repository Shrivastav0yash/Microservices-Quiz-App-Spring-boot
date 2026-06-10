# Quiz Application Microservices

A distributed Quiz Application built using Spring Boot Microservices Architecture. The application demonstrates service discovery, inter-service communication, and the database-per-service pattern to create a scalable and maintainable backend system.

---

## Project Overview

This project is composed of multiple independent microservices, each with a dedicated responsibility and its own database.

| Service | Status | Description |
|----------|----------|-------------|
| Service Registry | ✅ Completed | Handles service registration and discovery |
| Question Service | ✅ Completed | Manages question-related operations |
| Quiz Service | ✅ Completed | Creates and manages quizzes |

---

## Architecture

```text
                           ┌─────────────────────┐
                           │  Service Registry   │
                           │   (Eureka Server)   │
                           └──────────┬──────────┘
                                      │
                   ┌──────────────────┼──────────────────┐
                   │                                     │
                   ▼                                     ▼

         ┌─────────────────┐                 ┌─────────────────┐
         │ Question Service│◄──────────────►│   Quiz Service  │
         └────────┬────────┘    REST APIs    └────────┬────────┘
                  │                                   │
                  ▼                                   ▼

         ┌─────────────────┐                 ┌─────────────────┐
         │  Question DB    │                 │    Quiz DB      │
         └─────────────────┘                 └─────────────────┘
```

---

## Microservices Principles Implemented

### Service Independence

Each microservice has its own:

- Source Code
- Business Logic
- Database
- Deployment Lifecycle

### Database Per Service

The application follows the Database-per-Service pattern.

| Service | Database |
|----------|----------|
| Question Service | Question Database |
| Quiz Service | Quiz Database |

Services communicate through REST APIs and never access another service's database directly.

### Service Discovery

The Service Registry (Netflix Eureka) enables:

- Dynamic Service Registration
- Service Discovery
- Health Monitoring
- Scalability Support

---

# Services

## 1. Service Registry

The Service Registry acts as the central discovery server for all microservices.

### Responsibilities

- Register Microservices
- Discover Available Services
- Maintain Service Instances
- Monitor Service Health

### Repository

🔗 https://github.com/Shrivastav0yash/quiz_app_service_registry

### Technology

- Spring Boot
- Spring Cloud
- Netflix Eureka

---

## 2. Question Service

The Question Service manages all question-related operations.

### Responsibilities

- Create Questions
- Retrieve Questions
- Retrieve Questions By Category
- Generate Question Sets
- Provide Questions To Quiz Service

### Repository

🔗 https://github.com/Shrivastav0yash/question_service

### Technology

- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs

---

## 3. Quiz Service

The Quiz Service manages all quiz-related operations and communicates with the Question Service to generate quizzes dynamically.

### Responsibilities

- Create Quizzes
- Store Quiz Data
- Request Questions From Question Service
- Retrieve Quiz Details
- Manage Quiz-Question Relationships

### Repository

🔗 https://github.com/Shrivastav0yash/quiz_service

### Technology

- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs

---

## Technology Stack

### Backend

- Java
- Spring Boot
- Spring Cloud

### Database

- MySQL

### Build Tool

- Maven

### Communication

- REST APIs

### Service Discovery

- Netflix Eureka

### Development Tools

- IntelliJ IDEA
- Postman
- Git
- GitHub

---

## Features Demonstrated

- Microservices Architecture
- Service Discovery using Eureka
- Database-per-Service Pattern
- RESTful Inter-Service Communication
- Independent Service Deployment
- Layered Architecture
- Spring Data JPA Integration
- MySQL Database Management
- Scalable Backend Design

---

## Application Workflow

### Service Startup Flow

1. Start Service Registry
2. Start Question Service
3. Start Quiz Service

### Registration Flow

1. Question Service registers with Eureka
2. Quiz Service registers with Eureka
3. Eureka maintains service metadata
4. Services discover each other dynamically

### Quiz Creation Flow

1. User requests quiz creation
2. Quiz Service receives request
3. Quiz Service requests questions from Question Service
4. Question Service generates and returns question IDs/details
5. Quiz Service creates and stores the quiz
6. Quiz Service returns quiz information to the client

---

## Project Repositories

| Service | Repository |
|----------|------------|
| Service Registry | https://github.com/Shrivastav0yash/quiz_app_service_registry |
| Question Service | https://github.com/Shrivastav0yash/question_service |
| Quiz Service | https://github.com/Shrivastav0yash/quiz_service |

---

## Future Enhancements

- API Gateway
- OpenFeign Client
- Centralized Configuration Server
- Docker & Docker Compose
- Kubernetes Deployment
- Redis Caching
- JWT Authentication
- Centralized Logging
- Monitoring with Prometheus & Grafana
- CI/CD Pipelines

---

## Learning Objectives

This project was built to gain practical experience with:

- Spring Boot
- Spring Cloud
- Microservices Architecture
- Service Discovery
- REST API Development
- Inter-Service Communication
- Database Design
- Distributed Systems
- Scalable Backend Development

---

## Project Status

| Component | Status |
|------------|--------|
| Service Registry | ✅ Complete |
| Question Service | ✅ Complete |
| Quiz Service | ✅ Complete |

The core Quiz Application ecosystem is fully functional and demonstrates modern microservices architecture principles using Spring Boot and Spring Cloud.

---

## Author

**Yash Shrivastav**

Java Backend Developer passionate about building scalable backend applications using Java, Spring Boot, Microservices, and Distributed Systems.

GitHub: https://github.com/Shrivastav0yash
