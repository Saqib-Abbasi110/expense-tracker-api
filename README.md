<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src = "https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" />
</p>

# 💰 Expense Tracker API

A robust RESTful API built with **Java** and **Spring Boot** to manage, track, and organize daily personal expenses efficiently. 

---

## 📂 Project Repository

```text
src
└── main
    ├── java
    │   └── com.saqib.ExpenseTracker
    │       ├── Controller      # Handles HTTP requests & REST endpoints
    │       ├── Entity          # Database models/tables mapping
    │       ├── Repository      # Spring Data JPA interfaces for database operations
    │       └── TaskApplication # Main Spring Boot Application entry point
    └── resources
        ├── static          # Static assets (CSS, JS, images)
        ├── templates       # HTML templates (if using Thymeleaf)
        └── application.properties # Database & server configurations
```
---

## 🛠️ Tech Stack

| Layer | Technologies |
| :--- | :--- |
| `Language` | <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" /> |
| `Framework` | <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" /> |
| `Build Tool` | <img src = "https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" /> |
| `Database` | <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" /> |
| `ORMS` | <img src="https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/> <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white"/> |
| `API Testing` | <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" /> |

---

## 🚀 Features
* **Create Expense    (`POST`):**   Add new expenses with title, category, amount, and automatic timestamp.
* **Get All Expenses  (`GET`):**    Fetch a list of all recorded expenses.
* **Get Expense by ID (`GET`):**    Fetch a specific expense using its unique ID.
* **Update Expense    (`PUT`):**    Modify existing expense records securely.
* **Delete Expense    (`DELETE`):** Remove an expense entry from the database.

---

## 🔌 API Endpoints & Request Examples

### 1. Add New Expense
* **URL:** `POST /expense`
* **Description:** `Add a new record to list of all recorded expenses in the database.`
* **Body (JSON):**
```json
{
    "id": "1",
    "title": "Netflix Membership",
    "category": "Entertainment",
    "amount": 400.0
    "date": "2026-08-01T00:50:52.224205"
}
```
---

### 2. Get All Expenses
* **URL:** `Get /expense`
* **Description:** `Fetches a list of all recorded expenses from the database.`
* **Body (JSON):**
```json
{
    "id": "1",
    "title": "Netflix Membership",
    "category": "Entertainment",
    "amount": 400.0,
    "date": "2026-08-01T00:50:52.224205"
}
```
---

### 3. Get Expense by ID
* **URL:** `GET /expense/id/{myId}`
* **Description:** `Fetches a single expense record using its unique ID.`
* **Body (JSON):**
```json
{
    "id": 2,
    "title": "Gym Membership",
    "category": "Fitness and Health",
    "amount": 4000.0,
    "date": "2026-08-01T00:50:52.224205"
}
```
---

### 4. Update Expense
* **URL:** `PUT /expense/id/{myId}`
* **Description:** `Update a single expense record using its unique ID.`
* **Body (JSON):**
```json
{
    "id": "2",
    "title": "Medicine",
    "category": "Health",
    "amount": 1500.0,
    "date": "2026-08-01T00:50:52.224205"
}
```
---

### 4. Delete Expense
* **URL:** `DEL /expense/id/{myId}`
* **Description:** `delete a single expense record using its unique ID.`
* **Body (JSON):**
```json
{
    "id": "2",
    "title": "Medicine",
    "category": "Health",
    "amount": 1500.0,
    "date": "2026-08-01T00:50:52.224205"
}
```


