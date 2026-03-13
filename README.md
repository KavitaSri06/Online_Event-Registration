# Online Event Registration System

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-green.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-Central-red.svg)](https://maven.apache.org/)

## 🎉 Overview

**Online Event Registration System** is a full-featured event management platform with **two implementations**:

1. **Web Application** (Spring Boot REST API + Frontend)
   - Complete CRUD operations for Events and Participants
   - MySQL database persistence
   - Modern web interface with real-time search
   - Capacity management and registration validation

2. **Console Application** (Pure Java)
   - Same core functionality via command-line interface
   - In-memory data storage
   - Perfect for quick prototyping and testing

## ✨ Features

### Event Management
- ✅ Create Events (name, date, location, capacity, fee)
- ✅ View all Events
- ✅ Search Events by name
- ✅ Update Event details
- ✅ Delete Events

### Participant Registration
- ✅ Register participants for events
- ✅ Capacity validation (auto-blocks full events)
- ✅ View participants by event
- ✅ Email and registration date tracking

### Web App Specific
- ✅ RESTful API endpoints
- ✅ Responsive frontend
- ✅ Real-time event listing and search
- ✅ AJAX-powered registration

## 🏗️ Project Structure

```
online_event_reg/
├── event-system/              # Spring Boot Web Application
│   ├── src/main/java/com/event/event_system/
│   │   ├── EventSystemApplication.java     # Main entry point
│   │   ├── controller/
│   │   │   ├── EventController.java
│   │   │   └── ParticipantController.java
│   │   ├── entity/
│   │   │   ├── Event.java
│   │   │   └── Participant.java
│   │   └── repository/
│   │       ├── EventRepository.java
│   │       └── ParticipantRepository.java
│   ├── src/main/resources/
│   │   ├── application.properties         # MySQL config
│   │   └── static/
│   │       ├── index.html                 # Frontend
│   │       ├── style.css
│   │       └── script.js
│   ├── pom.xml                           # Spring Boot dependencies
│   └── target/                           # Compiled artifacts
├── console-version/                    # Pure Java Console App
│   ├── Main.java                        # Entry point
│   ├── Event.java
│   ├── Participant.java
│   ├── EventService.java                # Business logic
│   └── *.class                          # Compiled classes
└── pom.xml                              # Root project (duplicate)
```

## 🚀 Quick Start

### 1. Prerequisites
- **Java 17+**
- **MySQL 8.0+** (for web app)
- **Maven 3.8+**

### 2. Web Application (Recommended)

1. **Start MySQL Database**
   ```sql
   CREATE DATABASE event_system;
   ```

2. **Run Spring Boot App**
   ```bash
   cd event-system
   mvn spring-boot:run
   ```
   Or from root:
   ```bash
   cd event-system && mvnw spring-boot:run
   ```

3. **Access Application**
   - **Frontend**: http://localhost:8080
   - **API Docs**: http://localhost:8080/actuator (if enabled)

### 3. Console Application
```bash
cd console-version
javac *.java
java Main
```

## 💻 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/events` | List all events |
| `POST` | `/api/events` | Create new event |
| `GET` | `/api/events/search?name={name}` | Search events |
| `PUT` | `/api/events/{id}` | Update event |
| `DELETE` | `/api/events/{id}` | Delete event |
| `POST` | `/api/participants` | Register participant |

## 🛠️ Database Configuration

**MySQL (event-system/src/main/resources/application.properties)**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/event_system
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

## 📦 Technologies Stack

| Category | Technology |
|----------|------------|
| **Backend** | Spring Boot 3.2.0, Spring Data JPA |
| **Database** | MySQL 8.0 |
| **Frontend** | HTML5, Vanilla JavaScript, CSS3 |
| **Build** | Maven |
| **Validation** | Hibernate Validator |
| **Utilities** | Lombok |

## 🧪 Testing

```bash
# Run tests
mvn test
```

Includes `EventSystemApplicationTests.java` for integration testing.

## 📁 Console App Menu

```
1. Add Event
2. View Events  
3. Register Participant
4. View Participants
5. Exit
```

## 🔧 Development

### IDE Support
- **VS Code**: Java Extension Pack
- **IntelliJ IDEA**: Spring Boot support built-in

### Useful Commands
```bash
# Clean & Package
mvn clean package

# Generate JAR
mvn clean package -DskipTests

# Run with profile
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## 🚧 Known Issues / TODO

- [ ] Add authentication & authorization
- [ ] Payment integration
- [ ] Email notifications
- [ ] Advanced reporting dashboard
- [ ] Docker deployment
- [ ] Unit tests for controllers/services

## 🤝 Contributing

1. Fork the repository
2. Create feature branch (`git checkout -b feature/amazing-feature`)
3. Commit changes (`git commit -m 'Add amazing feature'`)
4. Push to branch (`git push origin feature/amazing-feature`)
5. Open Pull Request

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

**Your Name** - [Your GitHub](https://github.com/yourusername)

## 🙏 Acknowledgments

- Spring Boot Team
- MySQL Community
- Stack Overflow Community

---

⭐ **Star this repository if you found it helpful!** ⭐

---

*Built with ❤️ for modern event management*"

