# 🧩 User CRUD

A simple **CRUD (Create, Read, Update, Delete)** application built with **Spring Boot** to manage users with attributes **name**, **age**, and **sex**.  
This project was developed for learning and practicing **Spring Boot**, **JPA**, **Thymeleaf**, and **PostgreSQL**.

---

## 🚀 Features

- List all users  
- Create new users  
- Edit existing users  
- Delete users  
- Data persisted using PostgreSQL  
- Simple web interface built with Thymeleaf  

---

## 🛠️ Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf**
- **PostgreSQL**
- **Maven**
- **Lombok**

---

## ⚙️ Requirements

Before running the project, make sure you have installed:

- **Java 17** or higher  
- **Maven 3.8+**  
- **PostgreSQL 13+**

---

## 🧰 Application Configuration

Update the application credentials according to your local setup:
   ```properties
   server.port=PORT

   spring.datasource.url=DB_URL
   spring.datasource.username=DB_USERNAME
   spring.datasource.password=DB_PASSWORD
   ```

⚠️ **Note:** You must replace `DB_USERNAME` and `DB_PASSWORD` with your PostgreSQL credentials.

---

## ▶️ Running the Project

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/usercrud.git
cd usercrud
```

### 2. Build the project
```bash
mvn clean install
```

### 3. Run the application
```bash
mvn spring-boot:run
```

---

## 🧩 Endpoints (Examples)

| Method | Endpoint | Description        |
|---------|-----------|--------------------|
| GET     | `/users`  | List all users     |
| GET     | `/users/new` | Show form to create a new user |
| POST    | `/users`  | Save new user      |
| GET     | `/users/edit/{id}` | Show form to edit user |
| GET     | `/users/delete/{id}` | Delete user by ID |

---

## 💡 Notes

- Make sure you are using **Java 17 or newer**.
- The project uses **Spring Boot’s embedded Tomcat**, so no external server configuration is required.
- If you make changes to the model, you may need to drop and recreate the database.

---

## 🚀 Pull Request

As an educational project, I welcome contributions from third parties so that we are always learning and improving; all help is welcome.

---

## 📜 License

This project is open-source and available for educational purposes.  
Feel free to modify and use it as a base for your own learning or experiments.

---

🧠 **Author:** [Gustavo Viega](https://github.com/Guviega)
