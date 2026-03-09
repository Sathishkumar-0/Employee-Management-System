# Employee Management System

A backend **Employee Management System** built using **Spring Boot** that provides REST APIs to manage employee records.
The application supports **CRUD operations**, **user input validation**, and **global exception handling** to ensure reliable and secure API interactions.

---

## 🚀 Features

* Create, read, update, and delete **employee records**
* **RESTful API design**
* **Input validation** to ensure correct user data
* **Global exception handling** for clean error responses
* Structured using **layered architecture**
* Integration with **MySQL database**

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **MySQL**
* **Maven**
* **REST APIs**

---

## 📂 Project Architecture

The application follows a **Layered Architecture** to maintain clean separation of concerns.

```id="y1g0ch"
Controller Layer
        ↓
Service Layer
        ↓
Repository Layer
        ↓
Database (MySQL)
```

### Components

**Controller**

* Handles HTTP requests from clients
* Exposes REST endpoints for employee operations

**Service**

* Contains business logic
* Processes employee-related operations

**Repository**

* Communicates with the database using **Spring Data JPA**

---

## ⚙️ API Endpoints

### Create Employee

```id="x6v08m"
POST /api/employees
```

### Get All Employees

```id="kl98b8"
GET /api/employees
```

### Get Employee by ID

```id="ny5w5s"
GET /api/employees/{id}
```

### Update Employee

```id="3sbwds"
PUT /api/employees/{id}
```

### Delete Employee

```id="q8ah4k"
DELETE /api/employees/{id}
```

---

## ✅ Input Validation

User inputs are validated using **Spring Boot Validation annotations** such as:

* `@NotNull`
* `@NotBlank`
* `@Email`
* `@Size`

This ensures only **valid and properly formatted data** is stored in the database.

---

## ⚠️ Exception Handling

The application implements **Global Exception Handling** to manage errors gracefully.

Handled exceptions include:

* Resource not found
* Invalid input data
* Database-related errors

Custom error responses are returned to maintain **consistent API responses**.

---

## ▶️ How to Run the Project

1. Clone the repository

```id="8aknbg"
git clone https://github.com/your-username/employee-management-system.git
```

2. Navigate to the project directory

```id="9k1xhl"
cd employee-management-system
```

3. Configure **MySQL database** in `application.properties`

4. Run the application

```id="cw7i0g"
mvn spring-boot:run
```

---

## 👨‍💻 Author

**Sathishkumar M**
Java Backend Developer
