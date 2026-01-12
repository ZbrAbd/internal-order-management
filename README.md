# Internal Order Management

![Java CI with Maven](https://github.com/ZbrAbd/internal-order-management/actions/workflows/maven-ci.yml/badge.svg)

A Spring Boot application to manage **users, products, and orders** using JPA and SQL Server.  
Supports REST APIs for CRUD operations and is ready for remote evaluation.

---

## Features

- Manage **AppUser**, **Product**, and **Order** entities
- REST API for CRUD operations
- SQL Server integration with Hibernate JPA
- DTOs for clean API requests (optional)
- Unit tests for controllers using MockMvc
- CI/CD pipeline with GitHub Actions
- Easy to extend for additional functionality

---

## Prerequisites

- JDK 17 or higher
- SQL Server (network instance)
- Maven (or use included Maven Wrapper `./mvnw`)

---

## Setup & Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/ZbrAbd/internal-order-management.git
   cd order-management
