# 🧠 Full Stack Quiz App (React + Spring Boot)

This is a full-stack quiz application built with a **React.js frontend** and a **Spring Boot backend**. Users can choose a topic (Java, Python, SQL, C++) and answer multiple-choice questions, with instant correctness feedback after each response.

---

## 🔧 Tech Stack

- **Frontend:** React (Vite), Tailwind CSS, Fetch API
- **Backend:** Java 17, Spring Boot 3, Spring Data JPA, H2 Database
- **Database:** In-memory H2 (via `data.sql`)
- **Build Tools:** Maven, npm

---

## 📁 Folder Structure

quiz-app/
├── quiz-backend/ # Spring Boot backend
└── quiz-frontend/ # React frontend

yaml
Copy
Edit

---

## 🚀 Backend Setup (`quiz-backend`)

### ✅ Prerequisites
- Java 17+
- Maven

### ▶️ Running the App
```bash
cd quiz-backend
./mvnw spring-boot:run
🛠️ API Endpoints
Method	Endpoint	Description
GET	/api/quiz/questions?topic=Java	Fetch quiz questions
POST	/api/quiz/evaluate	Evaluate user's answer

🗃️ H2 Console
URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (empty)

✅ Supported Topics
Java

Python

SQL

C++

🎨 Frontend Setup (quiz-frontend)
✅ Prerequisites
Node.js 16+

npm

▶️ Running the App
bash
Copy
Edit
cd quiz-frontend
npm install
npm run dev
📁 Structure
bash
Copy
Edit
src/
├── api/               # API functions (fetch & evaluate)
├── components/        # QuestionCard, ResultModal
├── pages/             # QuizPage.jsx
├── App.jsx
└── main.jsx
🌐 Default URL
Frontend: http://localhost:5174

Backend: http://localhost:8080

💡 Features
Select a quiz topic from dropdown

View questions one-by-one

Submit answer and get result instantly

Navigate through all questions

Simple, responsive, and intuitive UI

Backend validates each answer

🛠️ Suggestions to Improve
You can enhance this project further by adding:

Final score + summary page

Timer for each question

User login & score history

Quiz difficulty levels

Leaderboard with ranks

Export to PDF

Question pagination

Add/Edit Questions from Admin Panel

Persist data in PostgreSQL or MySQL

Host backend on Render and frontend on Vercel

🧪 Quick Test Instructions
Start the backend:

bash
Copy
Edit
cd quiz-backend
./mvnw spring-boot:run
Start the frontend:

bash
Copy
Edit
cd quiz-frontend
npm install
npm run dev
Open browser at http://localhost:5174, choose a topic, answer questions, and view results.

📦 Deployment Tips
Push to GitHub

Host frontend on Vercel/Netlify

Host backend on Render/Fly.io

Replace localhost with hosted URLs in frontend

🙌 Author
Made with 💻 by Adnan Aslam
GitHub: github.com/adnanaslam123

📄 License
This project is free and open-source for learning and development purposes.

yaml
Copy
Edit

---

Let me know if you also want a sample `package.json`, `.gitignore`, or help setting up GitHub Actions fo
