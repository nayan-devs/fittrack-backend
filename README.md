# 🏋️ FitTrack Backend

FitTrack is a Spring Boot backend application that enables users to track fitness activities, manage workout data, and receive personalized fitness recommendations.

Built using industry-standard backend development practices, the project demonstrates REST API design, layered architecture, database relationships, DTO-based communication, and PostgreSQL integration.

---

## ✨ Project Highlights

### Implemented Modules

✅ User Management Module

- User registration
- UUID-based user identification
- Profile information management

✅ Activity Tracking Module

- Track fitness activities
- Record workout duration
- Record calories burned
- Store activity-specific metrics using PostgreSQL JSONB

✅ Recommendation Module

- Generate personalized fitness recommendations
- Store improvement suggestions
- Store workout guidance
- Store safety recommendations
- Retrieve recommendations by user or activity

---

## 🛠 Technical Highlights

- Spring Boot REST APIs
- Layered Architecture (Controller → Service → Repository)
- DTO Pattern (Request / Response Separation)
- PostgreSQL Database Integration
- Hibernate / Spring Data JPA
- Entity Relationships (One-to-Many & Many-to-One)
- JSONB Storage for Flexible Data
- Maven Build Management
- Lombok for Boilerplate Reduction

---

## 🏗 Architecture

```text
Controller Layer
        ↓
Service Layer
        ↓
Repository Layer
        ↓
PostgreSQL Database
```

### Why this Architecture?

The project follows a layered architecture to ensure:

- Separation of concerns
- Maintainable codebase
- Scalability
- Easier testing and debugging
- Industry-standard backend design

---

## 🚀 Features

### 👤 User Module

Manage user registration and profile information.

**Endpoint**

```http
POST /api/auth/register
```

---

### 🏃 Activity Module

Track user fitness activities.

**Supported Activity Types**

- RUNNING
- WALKING
- CYCLING
- SWIMMING
- WEIGHT_TRAINING
- YOGA
- CARDIO
- STRETCHING
- OTHER

**Endpoints**

```http
POST /api/activities
```

```http
GET /api/activities
```

Header:

```text
X-User-ID: {userId}
```

---

### 💡 Recommendation Module

Generate and manage fitness recommendations.

**Endpoints**

```http
POST /api/recommendation/generate
```

```http
GET /api/recommendation/user/{userId}
```

```http
GET /api/recommendation/activity/{activityId}
```

---

## 🗄 Database Design

```text
User (1) ----------> (N) Activity

User (1) ----------> (N) Recommendation

Activity (1) ------> (N) Recommendation
```

---

## 🛠 Tech Stack

### Backend

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Lombok

### Database

- PostgreSQL
- JSONB Support

### Build Tool

- Maven

---

## 📈 Current Progress

### Completed

- User Registration Module
- Activity Tracking Module
- Recommendation Module
- DTO Mapping
- Service Layer
- Repository Layer
- PostgreSQL Integration
- JSONB Storage
- Entity Relationships

### Planned Enhancements

- Request Validation
- Global Exception Handling
- JWT Authentication
- Swagger/OpenAPI Documentation
- AI-Based Recommendation Generation
- Unit Testing
- Docker Support

---

## 🎯 What I Learned

This project helped me gain hands-on experience with:

- Spring Boot Application Development
- REST API Design
- DTO Pattern
- JPA/Hibernate Relationships
- PostgreSQL Integration
- JSONB Mapping
- Layered Architecture
- Backend Development Best Practices

---

## 👨‍💻 Author

**Nayan**

GitHub: https://github.com/nayan-devs