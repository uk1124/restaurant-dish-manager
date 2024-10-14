# Restaurant Dish Manager

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Clone the Repository](#clone-the-repository)
  - [Setup](#setup)
- [Configuration](#configuration)
- [Endpoints](#endpoints)
  - [Welcome Endpoint](#welcome-endpoint)
  - [Get All Dishes](#get-all-dishes)
  - [Get Dish by ID](#get-dish-by-id)
  - [Create a New Dish](#create-a-new-dish)
  - [Delete a Dish](#delete-a-dish)
- [Testing the Application](#testing-the-application)
- [H2 Database Console](#h2-database-console)

## Project Overview

The **Restaurant Dish Manager** is a simple Spring Boot application designed to manage dishes in a restaurant. This application allows users to view, add, and delete dishes through a RESTful API.

## Technologies Used

- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For database interaction.
- **H2 Database**: In-memory database for development and testing.
- **Maven**: Dependency management and build tool.

## Getting Started

### Prerequisites

- JDK 17 or later
- Maven
- An IDE (e.g., IntelliJ IDEA, VS Code or Eclipse)

### Clone the Repository

To clone the repository, run the following command in your terminal:

```bash
git clone https://github.com/uk1124/restaurant-dish-manager.git
```

### Setup

1. **Navigate to the Project Directory**:

   ```bash
   cd restaurant-dish-manager
   ```

2. **Build the Application**:

```bash
mvn clean install
```

3. **Run the Application**:

You can run the application using your IDE or from the command line:

```bash
mvn spring-boot:run
```

## Configuration

Open `src/main/resources/application.properties` and ensure it contains the following configurations:

```properties
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
```

## Endpoints

### Welcome Endpoint

- **GET** `/`
  **Response**:
  - Welcome to our restaurant! Use /dishes to manage dishes.

### Get All Dishes

- **GET** `/dishes`
  **Response**:
  - Returns a list of all dishes in JSON format.

### Get Dish by ID

- **GET** `/dishes/{id}`

  **Parameters**:

  - `id`: The ID of the dish.

  **Response**:

  - Returns the dish with the specified ID in JSON format, or a 404 error if not found.

### Create a New Dish

- **POST** `/dishes`

  **Request Body**:

  ```json
  {
    "name": "Pasta",
    "description": "Delicious pasta with marinara sauce.",
    "price": 12.99,
    "category": "Main Course"
  }
  ```

  **Response**:

  - Returns the created dish in JSON format.

### Delete a Dish

- **DELETE** `/dishes/{id}`

  **Parameters**:

  - `id`: The ID of the dish to delete.

  **Response**:

  - Returns a 204 No Content status if the dish was successfully deleted, or a 404 error if not found.

## Testing the Application

You can test the application using tools like **Postman** or **curl**. Here are examples of how to use these tools to test the endpoints.

### Example with Postman

1. **Get All Dishes**:

   - **Method**: `GET`
   - **URL**: `http://localhost:8080/dishes`

2. **Get Dish by ID**:

   - **Method**: `GET`
   - **URL**: `http://localhost:8080/dishes/1`

3. **Create a New Dish**:

   - **Method**: `POST`
   - **URL**: `http://localhost:8080/dishes`
   - **Body (JSON)**:

   ```json
   {
     "name": "Pizza",
     "description": "Cheesy pizza with pepperoni.",
     "price": 10.99,
     "category": "Main Course"
   }
   ```

4. **Delete a Dish**:

- **Method**: `DELETE`
- **URL**: `http://localhost:8080/dishes/1`

## H2 Database Console

You can access the H2 database console at [http://localhost:8080/h2-console](http://localhost:8080/h2-console). Use the following settings to log in:

- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User Name**: `sa`
- **Password**: Leave blank.
