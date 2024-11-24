# Course-Management-System
This is a Modular Project , since it's a part of  large scale Full Stack Project for creating a deliverable product in the form of a Learning Management System.

Here is the code for your GitHub `README.md` file, formatted to provide clear and detailed information about your API. This README highlights the endpoints and gives potential users or contributors a comprehensive overview.


# API Documentation for Topics and Courses Management System

This project is a REST API built using **Java 8** and **Spring Boot**. The API provides endpoints to manage topics,
courses, and lessons, supporting CRUD operations. Below, you'll find a detailed description of all available endpoints.

---

## Features
- Manage **Topics**
- Manage **Courses** under a specific Topic
- Manage **Lessons** under a specific Course
- Follow RESTful principles for clean and scalable API design

---

## API Endpoints

### Topics Endpoints
1. **Get All Topics**
   - **Endpoint**: `GET /topics`
   - **Description**: Retrieves a list of all topics.

2. **Get a Topic by ID**
   - **Endpoint**: `GET /topics/{id}`
   - **Description**: Retrieves details of a specific topic by its ID.

3. **Create a New Topic**
   - **Endpoint**: `POST /topics`
   - **Description**: Creates a new topic.

4. **Update a Topic**
   - **Endpoint**: `PUT /topics/{id}`
   - **Description**: Updates an existing topic based on its ID.

5. **Delete a Topic**
   - **Endpoint**: `DELETE /topics/{id}`
   - **Description**: Deletes a specific topic by its ID.

---

### Courses Endpoints
6. **Get All Courses for a Topic**
   - **Endpoint**: `GET /topics/{topicId}/courses`
   - **Description**: Retrieves a list of all courses under a specific topic.

7. **Get a Course by ID**
   - **Endpoint**: `GET /topics/{topicId}/course/{id}`
   - **Description**: Retrieves details of a specific course by its ID under a given topic.

8. **Create a New Course**
   - **Endpoint**: `POST /topics/{topicId}/courses`
   - **Description**: Creates a new course under a specific topic.

9. **Update a Course**
   - **Endpoint**: `PUT /topics/{topicId}/course/{id}`
   - **Description**: Updates an existing course by its ID under a given topic.

10. **Delete a Course**
    - **Endpoint**: `DELETE /topics/{topicId}/course/{id}`
    - **Description**: Deletes a specific course by its ID under a given topic.

---

### Lessons Endpoints
11. **Get All Lessons for a Course**
    - **Endpoint**: `GET /topics/{topicId}/course/{courseId}/lessons`
    - **Description**: Retrieves a list of all lessons under a specific course.

12. **Get a Lesson by ID**
    - **Endpoint**: `GET /topics/{topicId}/course/{courseId}/lessons/{id}`
    - **Description**: Retrieves details of a specific lesson by its ID under a given course.

13. **Create a New Lesson**
    - **Endpoint**: `POST /topics/{topicId}/course/{courseId}/lessons`
    - **Description**: Creates a new lesson under a specific course.

14. **Update a Lesson**
    - **Endpoint**: `PUT /topics/{topicId}/course/{courseId}/lessons/{id}`
    - **Description**: Updates an existing lesson by its ID under a given course.

15. **Delete a Lesson**
    - **Endpoint**: `DELETE /topics/{topicId}/course/{courseId}/lessons/{id}`
    - **Description**: Deletes a specific lesson by its ID under a given course.

---

## How to Run
1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Navigate to the project directory:
   ```bash
   cd <project_directory>
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

---

## How to Test
You can use tools like **Postman** or **cURL** to test these endpoints. Replace `{id}`, `{topicId}`, or `{courseId}` with appropriate values when making API calls.

---

## Contribution
Contributions are welcome! Feel free to open issues or submit pull requests.

---

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact
If you have any questions, feel free to reach out via [soumikghoshcodes@gmail.com] or [www.linkedin.com/in/soumikg-li].
```

