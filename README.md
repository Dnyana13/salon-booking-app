# Salon Booking App

## Project Overview

The **Salon Booking App** is a web-based application that allows users to register, book salon appointments, manage bookings, and process payments. It is built using **Java Full Stack** technologies, including **Spring Boot (Backend)**, **Thymeleaf (Frontend)**, and **MySQL (Database)**.

## Features

- User Registration & Authentication
- Salon Profile & Services Display
- Appointment Booking System
- Admin Dashboard for Salon Management
- Payment Processing Integration
- Booking Confirmation & Notifications
- Error Handling & Validation

## Technologies Used

### Backend:

- **Java 17**
- **Spring Boot 3.4.2** (Spring Boot REST Services, Spring Data JPA)
- **MySQL 8.0.32**
- **Spring Security** (for Authentication & Authorization)
- **Maven** (for dependency management)

### Frontend:

- **Thymeleaf 3.1.3.RELEASE**
- **HTML, CSS, JavaScript**
- **Bootstrap** (for responsive UI)

### Other Tools:

- **Lombok** (for reducing boilerplate code)


## Installation & Setup

### Prerequisites

Ensure you have the following installed:

- **Java 17**
- **Maven**
- **MySQL 8.0.32**
- **Spring Boot CLI** (optional for easier development)
- **IntelliJ IDEA or Eclipse** (IDE for coding)

### Steps to Set Up the Project

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-repo/salon-booking-app.git
   cd salon-booking-app
   ```
2. **Configure Database**
   - Open `src/main/resources/application.properties` or `application.yml`
   - Update MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/salon_booking
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     ```
   - Run the following SQL script to create the database:
     ```sql
     CREATE DATABASE salon_booking;
     ```
3. **Build & Run the Application**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. **Access the App in Browser**
   - User Login: `http://localhost:8080/login`
   - Admin Dashboard: `http://localhost:8080/admin`
   - Salon Booking Page: `http://localhost:8080/book-appointment`

## API Endpoints

| Endpoint             | Method | Description               |
| -------------------- | ------ | ------------------------- |
| `/api/auth/signup`   | POST   | User Registration         |
| `/api/auth/login`    | POST   | User Login                |
| `/api/salons`        | GET    | Get list of salons        |
| `/api/bookings`      | POST   | Create a new booking      |
| `/api/bookings/{id}` | GET    | Get booking details by ID |
| `/api/payments`      | POST   | Process payment           |

## Testing

- **Run Unit Tests:**
  ```bash
  mvn test
  ```
- **Test API using Postman**
  - Import the Postman collection provided in the repo

## Debugging & Error Handling

- **Common Errors:**
  - `Database Connection Failed`: Ensure MySQL is running and credentials are correct
  - `Port 8080 already in use`: Stop any existing application running on this port
  - `Thymeleaf Template Not Found`: Check if `.html` files are placed in `src/main/resources/templates/`



