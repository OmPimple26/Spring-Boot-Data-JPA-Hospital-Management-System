# Spring-Boot-Data-JPA-Hospital-Management-System
🏥 Hospital Management System built using Spring Boot &amp; Spring Data JPA with PostgreSQL 🐘. It follows layered architecture, uses entities, enums, constraints, and transactional services 🔄. The project demonstrates real-world database design, first-level caching, and clean backend development practices 🚀

---

## 🚀 Tech Stack

* **Java 21**
* **Spring Boot 3.x**
* **Spring Data JPA (Hibernate)**
* **PostgreSQL**
* **JUnit 5**
* **Maven**
* **Git & GitHub**

---

## 📌 Domain Model (Entities)

The system models a real hospital environment using the following entities:

* **Patient**
* **Doctor**
* **Department**
* **Appointment**
* **Insurance**

Each entity is mapped using proper JPA annotations following real-world database design principles.

---

## 🔗 JPA Relationships Implemented

### ✅ One-to-One

* **Patient ↔ Insurance**

  * Patient owns the relationship
  * Insurance is dependent on Patient
  * Demonstrates `cascade`, `orphanRemoval`, and ownership

### ✅ One-to-Many / Many-to-One

* **Department → Doctors**
* **Doctor → Appointments**
* **Patient → Appointments**

### ✅ Bi-Directional Mappings

* Proper use of **owning side** and **inverse side**
* `mappedBy` used correctly to avoid extra join tables

---

## ⚙️ JPA Concepts Covered

* Owning side vs Inverse side
* `@OneToOne`, `@OneToMany`, `@ManyToOne`
* Cascading (`PERSIST`, `MERGE`, `REMOVE`)
* `orphanRemoval = true`
* Fetch strategies:

  * `FetchType.LAZY`
  * `FetchType.EAGER`
* Transaction management using `@Transactional`
* Repository query methods

---

## 🧪 Testing

JUnit test cases are written to validate:

* Entity persistence
* Relationship mappings
* Cascade behavior
* Insurance assignment & disassociation
* Repository operations

Test packages:

```
src/test/java/com/springBoot/hospitalManagement
```

---

## 🗄️ Database Configuration

* **PostgreSQL** is used as the database
* Schema is validated using:

```properties
spring.jpa.hibernate.ddl-auto=validate
```

* Initial data is inserted using `data.sql`
* SQL initialization is explicitly controlled

---

## 📂 Project Structure

```
.mvn/
    └── wrapper/
        └── maven-wrapper.properties
src/
    ├── main/
        ├── java/
            └── com/
                └── springBoot/
                    └── hospitalManagement/
                        ├── dto/
                            └── BloodGroupCountResponseEntity.java
                        ├── entity/
                            ├── type/
                                └── BloodGroupType.java
                            ├── Appointment.java
                            ├── Department.java
                            ├── Doctor.java
                            ├── Insurance.java
                            └── Patient.java
                        ├── repository/
                            ├── AppointmentRepository.java
                            ├── DepartmentRepository.java
                            ├── DoctorRepository.java
                            ├── InsuranceRepository.java
                            └── PatientRepository.java
                        ├── service/
                            ├── AppointmentService.java
                            ├── InsuranceService.java
                            └── PatientService.java
                        └── HospitalManagementApplication.java
        └── resources/
            ├── application.properties
            └── data.sql
    └── test/
        └── java/
            └── com/
                └── springBoot/
                    └── hospitalManagement/
                        ├── HospitalManagementApplicationTests.java
                        ├── InsuranceTests.java
                        └── PatientTests.java
.gitattributes
.gitignore
LICENSE
mvnw
mvnw.cmd
pom.xml
README.md
```

---

## 🎯 Project Goal

This project was built to:

* Gain **hands-on experience with Spring Data JPA**
* Understand **real-world entity relationships**
* Learn **best practices** for ORM mapping
* Build a **strong backend foundation** for enterprise applications

---

## 📈 Current Status

✔ Entity relationships implemented
✔ Database schema stable
✔ Test cases passing
✔ GitHub version controlled

🔜 REST APIs, DTOs, and advanced features can be added later

---

## 🙌 Author

**Om Pimple**
B.Tech Computer Engineering
Spring Boot & Backend Development Enthusiast

---

## ⭐ How to Run (Optional)

1. Configure PostgreSQL database
2. Update `application.properties`
3. Run:

```bash
mvn spring-boot:run
```
