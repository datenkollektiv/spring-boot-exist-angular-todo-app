# Spring Boot, eXist, Angular Restful API Tutorial

> Note: This is the adapted version of [callicoder/spring-boot-mongodb-angular-todo-app](https://github.com/callicoder/spring-boot-mongodb-angular-todo-app) which replaces MongoDB in the backend with [eXist](https://exist-db.org/).
For more information please visit the posts [Building a Simple eXist Repository on Top of Spring Data](https://devops.datenkollektiv.de/building-a-simple-exist-repository-on-top-of-spring-data.html) and [Spring Framework meets eXist-db](https://devops.datenkollektiv.de/spring-framework-meets-exist-db.html).

Build a Fully-Fledged Todo App with Spring Boot & eXist in the Backend and Angular in the frontend.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. eXist - 4.3.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/datenkollektiv/spring-boot-exist-angular-todo-app.git
```

**2. Build and run the backend app using maven wrapper**

```bash
cd spring-boot-backend
mvnw package
java -jar target/todoapp-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvnw spring-boot:run
```

The backend server will start at <http://localhost:8080>.

**3. Run the frontend app using npm**

```bash
cd angular-frontend
npm install
```

```bash
npm start
```

Frontend server will run on <http://localhost:4200>

## Learn more

You can find the original tutorial for this application on the blog -

<https://www.callicoder.com/spring-boot-mongodb-angular-js-rest-api-tutorial/>
