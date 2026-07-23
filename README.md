# 📚 Library Management System

A **console-based Library Management System** developed in **Java** that demonstrates Object-Oriented Programming (OOP), Collections, Exception Handling, File Handling, and Serialization. The application enables users to efficiently manage books through an interactive menu-driven interface while preserving data between program executions.

---

## 🌟 Features

### 📖 Book Management

* ➕ Add a new book
* 📚 Display all books
* 🔍 Search book by ID
* 🔎 Search book by Title
* 👨‍💼 Search book by Author
* 📂 Search book by Category
* ✏️ Update book details
* ❌ Delete a book

### 📋 Library Operations

* 📤 Issue books to members
* 📥 Return issued books
* 📊 View library statistics
* 🔄 Sort books by title
* 🚫 Prevent duplicate entries
* ✅ Input validation for user data

### 💾 Data Persistence

* Save book records using Java Serialization
* Automatically load saved records when the application starts

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework (ArrayList)
* Exception Handling
* File Handling
* Object Serialization
* Git & GitHub

---

# 📂 Project Structure

```text
Library-Management-System
│
├── src
│   ├── exception
│   │   ├── BookAlreadyIssuedException.java
│   │   └── BookNotFoundException.java
│   │
│   ├── main
│   │   ├── Main.java
│   │   └── Menu.java
│   │
│   ├── model
│   │   ├── Book.java
│   │   └── Member.java
│   │
│   ├── service
│   │   └── LibraryService.java
│   │
│   └── util
│       ├── BookIdGenerator.java
│       ├── ConsoleUtil.java
│       ├── FileManager.java
│       └── InputValidator.java
│
├── data
│   └── books.dat
│
├── .gitignore
└── README.md
```

---

# 🎯 Concepts Demonstrated

* Object-Oriented Programming (OOP)
* Encapsulation
* Constructors
* Method Overloading
* Custom Exceptions
* Java Collections
* File Handling
* Object Serialization
* Input Validation
* Modular Programming
* Clean Code Practices

---

# ▶️ Getting Started

## Prerequisites

* Java JDK 17 or later
* VS Code / IntelliJ IDEA / Eclipse

## Clone the Repository

```bash
git clone https://github.com/samjh07/Library-Management-System.git
```

## Open the Project

Open the project in your preferred Java IDE.

## Run the Application

Run the `Main.java` file.

---

# 🖥️ Application Menu

```text
=================================
 LIBRARY MANAGEMENT SYSTEM
=================================

1. Add Book
2. Display Books
3. Search Book
4. Update Book
5. Delete Book
6. Issue Book
7. Return Book
8. Exit
```

---

# 📸 Screenshots

## Add Book
<img width="367" height="412" alt="Screenshot 2026-07-24 005247" src="https://github.com/user-attachments/assets/90f34e77-b174-491e-b7d7-675cbe640dc9" />

## Display Books
<img width="371" height="491" alt="Screenshot 2026-07-24 005307" src="https://github.com/user-attachments/assets/3561019a-189b-4e9a-853e-47827a088922" />

## Issue Book
<img width="383" height="406" alt="Screenshot 2026-07-24 005341" src="https://github.com/user-attachments/assets/dbd3a304-ce87-47bf-a3b8-7a6622a0332b" />

---

# 🚀 Future Improvements

* Database integration using MySQL
* JDBC implementation
* Login and authentication
* Due date and fine calculation
* Member management
* Book reservation system
* Spring Boot REST API
* JavaFX or Swing GUI

---

# 📈 Learning Outcomes

This project helped strengthen my understanding of:

* Designing Java applications using OOP principles
* Managing data using Collections
* Creating modular, maintainable code
* Handling exceptions effectively
* Persisting data with serialization
* Building interactive console applications
* Using Git and GitHub for version control

---

# 👨‍💻 Author

**Samridh Jha**

Computer Science Engineering Student

* 💻 Passionate about Java Development
* 🌱 Currently learning DSA, JDBC, MySQL, and Software Development
* 🔗 GitHub: https://github.com/samjh07

---

## ⭐ Support

If you found this project useful, consider giving it a **⭐ Star** on GitHub!
