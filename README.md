# Python-to-Java Code Converter

This project is a web-based application that allows users to input Python code, convert it to Java, and interact with the code using a ChatGPT-like interface. The system consists of a FastAPI backend for code parsing/conversion and a modern React (Vite + Tailwind CSS) frontend for user interaction.

## Project Structure

```
Project for theory class/
├── backend/         # FastAPI backend, ANTLR grammar, code conversion logic
├── frontend/        # React frontend, chat interface
├── .vscode/         # VSCode settings (optional)
```

## Features
- Convert Python code to Java using ANTLR and custom visitor logic
- Chat interface for code input, conversion, and output queries
- View output of executed Python code
- Save and retrieve code and parse trees

## Prerequisites
- Python 3.8+
- Node.js (v16+ recommended) & npm
- Java (for ANTLR code generation, if you need to re-generate parsers)

## Backend Setup (FastAPI)
Run the backend server:
   ```sh
   cd backend
   uvicorn server:app --reload
   ```
   The backend will be available at `http://localhost:8000`.

## Frontend Setup (React + Vite)
Run the frontend development server:
   ```sh
   cd frontend
   npm run dev
   ```
   The frontend will be available at the URL shown in your terminal (typically `http://localhost:5173`).

## Usage Guide
1. Start the backend server (see above).
2. Start the frontend dev server (see above).
3. Open the frontend URL in your browser.
4. Enter Python code in the chat, send it, and receive the Java conversion.
5. Use commands like
   - show grammar — display the grammar or parse tree
   - show output — show the output of running your Python code
   - store the code — save the current code
   - retrieve the saved code — get the previously saved code

## Notes
- The backend uses ANTLR to parse Python code and convert it to Java. If you modify the grammar (`proj.g4`), you may need to regenerate the parser files.
- The frontend communicates with the backend via REST API calls.
- Do not commit the `node_modules` or Python virtual environment folders.

## Example Commands
- **Backend:**
  ```sh
  cd backend
  uvicorn server:app --reload
  ```
- **Frontend:**
  ```sh
  cd frontend
  npm run dev
  ```

---

For any issues, please check the code comments or contact the project maintainer.
