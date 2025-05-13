import CodeConverter from "../components/CodeConverter.jsx";
import "../src/App.css";

function App() {
  return (
    <div className="flex flex-col h-screen bg-white">
      <div className="flex h-full w-full">
        {/* Main chat area */}
        <main className="flex-1 flex flex-col w-full">
          <CodeConverter />
        </main>
      </div>
    </div>
  );
}

export default App;
