# JPA Practice
Practicing database connection with JPA in the Spring Boot framework.

Overview
This project demonstrates how to manage a MySQL and PostgreSQL database using Docker containers while integrating them with Spring Boot and JPA.

Database Structure

How to Run the Containers
To start the MySQL and PostgreSQL databases using Docker, follow these steps:

Clone the repository

```bash
git clone https://github.com/your-repo/jpa-practice.git
cd jpa-practice
```
Ensure Docker is running

Run the containers

```bash
docker-compose up -d
```
This will start both MySQL and PostgreSQL containers with persistent storage.

Check running containers


`docker ps`
or
`docker ps -a`

Stop the containers (when needed)

```bash
docker-compose down
```


Running the Spring Boot Application
After starting the containers, run your Spring Boot app with:

```bash
./mvnw spring-boot:run
```
or
```bash
mvn spring-boot:run
```
