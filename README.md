# MealDash

# 🍔 Food Delivery Application

A full-stack hobby project simulating a food delivery platform. Users can browse restaurants, add items to a cart, and simulate order and payment flows using test/sandbox APIs (no real payments involved).

---

## 🚀 Tech Stack Overview

### 🔷 Frontend

- **React.js** – For dynamic UI development.
- **Redux** – State management (user login, cart, and orders).
- **Tailwind CSS** – For clean and responsive styling.
- **React Router** – For routing and navigation.
- **Axios** – To communicate with the backend API.

### 🔶 Backend

- **Spring Boot** – RESTful backend API framework.
- **Spring Security** – JWT-based authentication and role management.
- **Spring Data MongoDB** – Integration with MongoDB for data persistence.
- **Apache Kafka** – For simple event/message-based communication (e.g., order events).
- **Stripe / PayPal (Sandbox Only)** – Used to simulate payments in a test environment.

### 🛢️ Database

- **MongoDB** – NoSQL database for storing restaurant, menu, and order data.

### ☁️ Deployment & DevOps

- **Docker** – For containerizing backend/frontend services.
- **Cloud Hosting** – Deployable to platforms like AWS, etc. (optional).
- **CI/CD** – GitHub Actions for automation (optional).

### 🔐 Authentication & Security

- **JWT** – Secure token-based login and route protection.

### 🔗 APIs & Integrations

- **Google Maps API** – (Optional) For restaurant location and delivery mapping.
- **Stripe (Test Mode)** – For demo payment flow using test credentials.

> ⚠️ This is a demo project. No real payments are processed. All payment flows are simulated using official test/sandbox APIs.

### 🧪 Testing

- **JUnit & Mockito** – For backend testing.
- **Jest & React Testing Library** – For testing frontend components.
- **Cypress** – For end-to-end testing of the full user flow.

---

## 🛠️ Getting Started

### Prerequisites

- Node.js & npm
- Java 17+ & Maven
- Docker (optional)
- MongoDB (local or cloud)
- Stripe / PayPal developer account (test mode)
- Google Maps API key (optional)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/saurabhjojare/Food-Delivery-System.git
   cd food-delivery-app
