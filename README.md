# Item Management REST API

This project is a simple Java Spring Boot RESTful application developed as part of a
freelance assignment submission. The purpose of this project is to demonstrate basic
backend development skills including REST API design, input validation, exception
handling, and in-memory data storage.

---

## 🛠 Technology Stack

- Java 21 (LTS)
- Spring Boot 3.x
- Spring Web
- Jakarta Validation
- Maven

---

## 📌 Project Overview

The Item Management REST API provides basic functionality to:

- Add new items
- Retrieve items by their unique identifier

As per the assignment requirements, the application uses **in-memory storage**
and does not include any database integration. The focus is on clean API design,
clarity, and correctness.

---

## ▶️ How to Run the Application

### Prerequisites

- Java 21 installed
- Maven installed

### Steps

1. Clone the repository:
   ```bash
   git clone <your-github-repository-url>
2. Navigate to the project directory:
   ```bash
   cd item-management-api
3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
4. The application will start on:
   ```arduino
   http://localhost:8080

---

## 📡 API Endpoints

### ➕ Create a New Item

### POST /items

#### Request Body (JSON):

   ```json
   {
  "name": "Laptop",
  "description": "Gaming laptop"
}
   ```

#### Response (201 CREATED):

   ```json
  {
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
  }
   ```

### 🔍 Retrieve Item by ID

#### GET /items/{id}

#### Example:

   ```bash
  GET /items/1
   ```

#### Response (200 OK):

   ```json
   {
   "id": 1,
   "name": "Laptop",
   "description": "Gaming laptop"
   }
   ```

### ❌ Item Not Found

If the requested item ID does not exist:

#### Response (404 NOT FOUND):

   ```json
   {
   "error": "Item not found with id: 99"
   }
   ```

### ⚠️ Validation Errors

If mandatory fields are missing or empty:

#### Response (400 BAD REQUEST):
   ```json
   {
   "name": "Item name must not be empty",
   "description": "Item description must not be empty"
   }
   ```

--- 

## 🧠 Implementation Notes

- In-memory data storage is implemented using a Map collection
- Input validation is handled using Jakarta Validation annotations
- Global exception handling is implemented using @RestControllerAdvice
- Constructor-based dependency injection is used to follow best practices

---

## 🧪 Testing

- APIs can be tested using Postman or curl
- Sample requests and responses are provided in this documentation

---

## 🌍 Live Application

``` arduino
Copy code
https://item-management-api-ecq3.onrender.com/swagger-ui/index.html
```

---

## 👤 Author
### Trilochan Pradhan
#### Java Backend Developer (Fresher)

---

## 📩 Contact

For any questions or clarifications regarding this submission, please feel free to reach out.
trilochanp2001@gmail.com