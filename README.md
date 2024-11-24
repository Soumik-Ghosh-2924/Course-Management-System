# 📚 Course Management System  

**A Modular Project**  
Part of a larger Full Stack application designed to create a fully functional Learning Management System (LMS).  

Built with **Java 8** and **Spring Boot**, this project delivers a robust and scalable API for managing topics, courses, and lessons.  

---

## 🚀 Key Features  

### 🧩 **Topics Management**  
- Create, update, delete, and view topics seamlessly.  

### 🎓 **Courses Management**  
- Manage courses under specific topics with ease.  
- Features include adding, updating, deleting, and viewing details.  

### 📖 **Lessons Management**  
- Organize lessons under courses efficiently.  
- Perform CRUD operations for each lesson.  

---

## 🌐 API Documentation  

| **Category**         | **HTTP Method** | **Endpoint**                                         | **Description**                                            |
|-----------------------|-----------------|-----------------------------------------------------|------------------------------------------------------------|
| **Topics**           | `GET`           | `/topics`                                           | Retrieve all topics.                                       |
| **Topics**           | `GET`           | `/topics/{id}`                                      | Retrieve a specific topic by ID.                          |
| **Topics**           | `POST`          | `/topics`                                           | Create a new topic.                                        |
| **Topics**           | `PUT`           | `/topics/{id}`                                      | Update an existing topic.                                  |
| **Topics**           | `DELETE`        | `/topics/{id}`                                      | Delete a specific topic.                                   |
| **Courses**          | `GET`           | `/topics/{topicId}/courses`                        | Get all courses under a specific topic.                   |
| **Courses**          | `GET`           | `/topics/{topicId}/course/{id}`                    | Get details of a specific course by ID.                   |
| **Courses**          | `POST`          | `/topics/{topicId}/courses`                        | Create a new course under a specific topic.               |
| **Courses**          | `PUT`           | `/topics/{topicId}/course/{id}`                    | Update an existing course by ID.                          |
| **Courses**          | `DELETE`        | `/topics/{topicId}/course/{id}`                    | Delete a specific course by ID.                           |
| **Lessons**          | `GET`           | `/topics/{topicId}/course/{courseId}/lessons`      | Get all lessons under a specific course.                  |
| **Lessons**          | `GET`           | `/topics/{topicId}/course/{courseId}/lessons/{id}` | Get details of a specific lesson by ID.                   |
| **Lessons**          | `POST`          | `/topics/{topicId}/course/{courseId}/lessons`      | Create a new lesson under a specific course.              |
| **Lessons**          | `PUT`           | `/topics/{topicId}/course/{courseId}/lessons/{id}` | Update an existing lesson by ID.                          |
| **Lessons**          | `DELETE`        | `/topics/{topicId}/course/{courseId}/lessons/{id}` | Delete a specific lesson by ID.                           |  

---

## 🛠️ How to Set Up  

1. **Clone the Repository**  
   ```bash  
   git clone <repository_url>  
   ```  

2. **Navigate to the Project Directory**  
   ```bash  
   cd <project_directory>  
   ```  

3. **Build the Project**  
   ```bash  
   mvn clean install  
   ```  

4. **Run the Application**  
   ```bash  
   mvn spring-boot:run  
   ```  

---

## 🧪 How to Test  

Use **Postman** or **cURL** to interact with the API:  

- **Postman Example:**  
  1. Open Postman.  
  2. Create a new request.  
  3. Set the method (GET, POST, PUT, DELETE).  
  4. Enter the endpoint (e.g., `http://localhost:8080/topics`).  
  5. Add required parameters or request body (if applicable).  

- **cURL Example:**  
   ```bash  
   curl -X GET http://localhost:8080/topics  
   ```  

---

## 🛡️ Built With  

- **Java 8**  
- **Spring Boot Framework**  
- **Maven** for dependency management  

---

## 📬 Contribution  

Contributions are welcome! Follow these steps:  
1. Fork this repository.  
2. Create a new branch (`feature/my-new-feature`).  
3. Commit your changes (`git commit -m 'Add my feature'`).  
4. Push to the branch (`git push origin feature/my-new-feature`).  
5. Open a Pull Request.  

---

## 📞 Contact  

- **Email**: [soumikghoshcodes@gmail.com](mailto:soumikghoshcodes@gmail.com)  
- **LinkedIn**: [Soumik Ghosh](https://www.linkedin.com/in/soumikg-li)  

---

### 🌟 Star This Repository  
If you found this helpful, please give it a ⭐ to show your support!  

--- 
