# Blog Platform API

This is a simple blog platform API built using Spring Boot. It allows you to perform CRUD operations on blog posts.

## Getting Started

To build and run the application, follow these steps:

1. Make sure you have Java and Maven installed on your machine.
2. Open a terminal or command prompt.
3. Navigate to the project directory.
4. Run the following command to build the JAR file: ./mvnw clean package
5. Once the build is successful, you can run the application using the following command: java -jar target/blogplatformapi-0.0.1-SNAPSHOT.jar
6. You can find the JAR file in blogplatformapi/target/
7. The application will start running on `http://localhost:8080`.

## Functionality

The blog platform API provides the following functionalities:

### BlogPost Model Class

The `BlogPost` model represents a blog post and contains the following attributes:

- `id` (Long): Unique identifier for the blog post.
- `title` (String): Title of the blog post.
- `content` (String): Content of the blog post.
- `author` (String): Author of the blog post.

### BlogPostRepository Class

The `BlogPostRepository` class is responsible for interacting with the underlying data storage, such as a database. It provides methods for CRUD operations on `BlogPost` entities.

### BlogPostService Class

The `BlogPostService` class acts as a middle layer between the controller and the repository. It implements the business logic for manipulating blog posts. It provides methods to create, read, update, and delete blog posts.

### BlogPostController Class

The `BlogPostController` class handles HTTP requests and serves as the entry point for the API endpoints. It maps the request URLs to the corresponding methods in the controller class. It supports the following operations:

- `GET /posts`: Returns a list of all blog posts.
- `POST /posts`: Creates a new blog post. The request body should contain the title, content, and author.
- `GET /posts/{id}`: Returns the blog post with the specified ID.
- `PUT /posts/{id}`: Updates the blog post with the specified ID. The request body should contain the new title, content, and/or author.
- `DELETE /posts/{id}`: Deletes the blog post with the specified ID.

Feel free to explore the codebase and make modifications according to your needs. Happy blogging!




