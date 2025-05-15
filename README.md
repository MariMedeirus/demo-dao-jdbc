# 💼 demo-dao-JDBC

This is a Java project that uses JDBC for database access, following the DAO (Data Access Object) design pattern. It manages two entities: `Seller` and `Department`, where each seller belongs to a department.

---

## 📚 Description

The main goal of this project is to demonstrate how to organize JDBC-based persistence logic using the DAO pattern, enabling better separation of concerns and easier maintainability.

### Main entities:

- `Department`: represents a company department.
- `Seller`: represents a salesperson who belongs to a department.

---

## 🧰 Technologies Used

- Java 21
- JDBC (Java Database Connectivity)
- MySQL
- DAO Pattern

---

## 🔄 Entity Relationship

```text
Department (id, name)
    ↑
Seller (id, name, email, birthDate, baseSalary, departmentId)


