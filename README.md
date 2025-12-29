# OOP Supermarket Management System

## 🚀 Overview
The **Supermarket Management System** is a robust, enterprise-grade Java application designed to streamline daily supermarket operations. Built on a modern **MVC (Model-View-Controller)** architecture, it ensures separation of concerns, scalability, and maintainability.

This system replaces legacy file-based storage with a secure, embedded **H2 Database**, ensuring data integrity for users, products, and invoices.

---

## 🔑 Key Features

### 1. 🛡️ Secure Authentication
-   **Role-Based Access**: Secure login for Admin and Staff.
-   **User Registration**: New staff members can register with validated credentials.
-   **Data Security**: Passwords and user profiles are stored securely in the local database.

### 2. 📦 Inventory Management
-   **Comprenhensive Dashboard**: View all products with details (ID, Name, Category, Price, Quantity).
-   **CRUD Operations**: Easily **Add**, **Update**, and **Delete** products.
-   **Real-time Updates**: Changes are immediately reflected in the database and UI.

### 3. 🧾 Point of Sale (Selling)
-   **Billing System**: Add products to a shopping cart with automatic total calculation.
-   **Invoice Generation**: Generates persistent invoices for every transaction.
-   **Stock Management**: Automatically deducts sold quantities from inventory.

### 4. 📊 Reporting & Analytics
-   **Excel Export**: Export the entire product inventory to an Excel file (`.xls`) for external reporting.
-   **Powered by Apache POI**: Professional-grade spreadsheet generation.

---

## 🛠️ Technology Stack
-   **Language**: Java 8+
-   **Architecture**: MVC (Model - View - Controller)
-   **GUI Framework**: Java Swing (javax.swing)
-   **Database**: H2 Embedded Database (SQL)
-   **Build Tool**: Apache Maven
-   **Libraries**:
    -   `h2-2.1.214` (Data Persistence)
    -   `poi-5.2.3` (Excel Reports)

---

## ⚙️ Installation & Setup

### Prerequisites
-   Java Development Kit (JDK) 8 or higher.
-   Maven (optional, if using integrated IDE support).

### 1. Clone the Repository
```bash
git clone https://github.com/omaribrahim44/OOP-Supermarket-Management-System.git
cd OOP-Supermarket-Management-System
```

### 2. Run the Application
**Using VS Code:**
1.  Open the project folder.
2.  Go to the **"Run and Debug"** tab.
3.  Select **"Run Supermarket App"** and click Play.

**Using Command Line (Maven):**
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.supermarket.ui.SplashFrame"
```

---

## 📂 Project Structure
```
src/main/java/com/supermarket
├── dao/          # Data Access Objects (SQL Queries)
├── model/        # Data Models (User, Product, Invoice)
├── service/      # Business Logic Services
├── ui/           # Graphical User Interface
└── util/         # Database Connection Utilities
```
---
*Developed as part of the OOP Coursework Project.*
