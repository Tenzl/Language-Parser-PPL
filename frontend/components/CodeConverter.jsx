import { useState, useEffect, useRef } from 'react';
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { vscDarkPlus } from 'react-syntax-highlighter/dist/esm/styles/prism';
import { CopyToClipboard } from 'react-copy-to-clipboard';

function CodeConverter() {
  const [pythonCode, setPythonCode] = useState('');
  const [chat, setChat] = useState([
    {
      id: 0,
      sender: 'bot',
      java: "Hey there! I'm your Python-to-Java converter, ready to help with a bit of wit and a lot of code. Drop some Python code, and I'll whip up Java for you faster than you can say 'null pointer exception'! 🚀",
      timestamp: new Date().toISOString(),
    },
  ]);
  const [isLoading, setIsLoading] = useState(false);
  const [copyStatus, setCopyStatus] = useState({});
  const chatEndRef = useRef(null);
  const textareaRef = useRef(null);

  useEffect(() => {
    chatEndRef.current?.scrollIntoView({ behavior: 'smooth' });
  }, [chat]);

  useEffect(() => {
    if (textareaRef.current) {
      textareaRef.current.style.height = 'auto';
      textareaRef.current.style.height = `${Math.min(textareaRef.current.scrollHeight, 120)}px`;
    }
  }, [pythonCode]);

  const convertPythonToJava = async (python) => {
    try {
      const res = await fetch('http://localhost:8000/convert', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ python_code: python.trim() + '\n' }),
      });
      const data = await res.json();
      if (data.error) {
        return `Error: ${Array.isArray(data.error) ? data.error.join('\n') : data.error}`;
      }
      return data.java_code || '// No output.';
    } catch (error) {
      return 'Error: Could not connect to the server. Please try again.';
    }
  };

  const handleSubmit = async () => {
    if (!pythonCode.trim()) return;
    const timestamp = new Date().toISOString();
    const tempId = Date.now();
    setChat([...chat, { id: tempId, python: pythonCode, sender: 'user', timestamp, status: 'sent' }]);
    setPythonCode('');
    setIsLoading(true);

    setTimeout(async () => {
      const javaCode = await convertPythonToJava(pythonCode);
      setChat(prevChat => [
        ...prevChat.filter(msg => msg.id !== tempId),
        { id: tempId, python: pythonCode, java: javaCode, sender: 'user', timestamp, status: 'delivered' },
        { id: tempId + 1, java: javaCode, sender: 'bot', timestamp: new Date().toISOString() },
      ]);
      setIsLoading(false);
    }, 1000);
  };

  const handleKeyPress = (e) => {
    if (e.key === 'Enter' && !e.shiftKey) {
      e.preventDefault();
      handleSubmit();
    }
  };

  const handleCopy = (id, type) => {
    setCopyStatus({ id, type, copied: true });
    setTimeout(() => setCopyStatus({}), 2000);
  };

  const formatTimestamp = (timestamp) => {
    const date = new Date(timestamp);
    return date.toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' });
  };

  return (
    <div className="flex flex-col h-screen w-full bg-gray-900 text-white font-sans">
      {/* Header */}
      <div className="bg-gray-800 p-4 shadow-lg">
        <div className="flex items-center justify-between">
          <div className="flex items-center space-x-3">
            <div className="h-10 w-10 rounded-full bg-gradient-to-r from-blue-500 to-purple-500 flex items-center justify-center">
              <span className="text-lg font-bold text-white">G</span>
            </div>
            <div>
              <h1 className="text-xl font-bold text-white">Python to Java Converter</h1>
              <div className="flex items-center space-x-2">
                <div className="h-3 w-3 rounded-full bg-green-400 animate-pulse"></div>
                <span className="text-sm font-medium text-green-300">Online</span>
              </div>
            </div>
          </div>
        </div>
      </div>

      {/* Messages */}
      <div className="flex-1 p-2 overflow-y-auto space-y-4 bg-gray-900">
        {chat.map((entry) => (
          <div key={entry.id} className="space-y-2">
            {/* User Message */}
            {entry.sender === 'user' && (
              <div className="flex justify-end">
                <div className="flex flex-col items-end w-full">
                  <div className="bg-gray-800 border border-gray-600 p-3 rounded-lg rounded-br-none shadow hover:shadow-lg transition-all duration-300">
                    <div className="flex justify-between items-center mb-2">
                      <span className="text-xs font-semibold uppercase text-blue-300">Python</span>
                      <CopyToClipboard text={entry.python} onCopy={() => handleCopy(entry.id, 'python')}>
                        <button className="text-xs text-gray-300 hover:text-blue-400 transition">
                          {copyStatus.id === entry.id && copyStatus.type === 'python' ? 'Copied!' : 'Copy'}
                        </button>
                      </CopyToClipboard>
                    </div>
                    <SyntaxHighlighter language="python" style={vscDarkPlus} customStyle={{ borderRadius: '0.375rem', margin: 0 }}>
                      {entry.python}
                    </SyntaxHighlighter>
                  </div>
                  <div className="flex items-center space-x-2 mt-1">
                    <span className="text-xs text-gray-400">{formatTimestamp(entry.timestamp)}</span>
                    <span className="text-xs text-gray-400">{entry.status}</span>
                  </div>
                </div>
              </div>
            )}

            {/* Bot Message */}
            {entry.sender === 'bot' && (
              <div className="flex justify-start">
                <div className="flex flex-col items-start w-full">
                  <div className="bg-gray-800 border border-gray-600 p-3 rounded-lg rounded-bl-none shadow hover:shadow-lg transition-all duration-300">
                    {entry.java.includes('Error') ? (
                      <p className="text-red-400">{entry.java}</p>
                    ) : entry.java.startsWith('//') ? (
                      <p className="text-gray-100">{entry.java}</p>
                    ) : (
                      <>
                        <div className="flex justify-between items-center mb-2">
                          <span className="text-xs font-semibold uppercase text-green-300">Java</span>
                          <CopyToClipboard text={entry.java} onCopy={() => handleCopy(entry.id, 'java')}>
                            <button className="text-xs text-gray-300 hover:text-blue-400 transition">
                              {copyStatus.id === entry.id && copyStatus.type === 'java' ? 'Copied!' : 'Copy'}
                            </button>
                          </CopyToClipboard>
                        </div>
                        <SyntaxHighlighter language="java" style={vscDarkPlus} customStyle={{ borderRadius: '0.375rem', margin: 0 }}>
                          {entry.java}
                        </SyntaxHighlighter>
                      </>
                    )}
                  </div>
                  <span className="text-xs text-gray-400 mt-1">{formatTimestamp(entry.timestamp)}</span>
                </div>
              </div>
            )}
          </div>
        ))}

        {/* Loading */}
        {isLoading && (
          <div className="flex justify-start">
            <div className="w-full bg-gray-800 border border-gray-600 p-3 rounded-lg rounded-bl-none shadow-md">
              <div className="flex items-center space-x-2">
                <div className="h-2 w-2 bg-blue-400 rounded-full animate-bounce"></div>
                <div className="h-2 w-2 bg-blue-400 rounded-full animate-bounce delay-75"></div>
                <div className="h-2 w-2 bg-blue-400 rounded-full animate-bounce delay-150"></div>
                <span className="text-sm text-gray-300">Converting...</span>
              </div>
            </div>
          </div>
        )}
        <div ref={chatEndRef} />
      </div>

      {/* Input */}
      <div className="bg-gray-800 p-2 border-t border-gray-700 shadow-inner">
        <div className="flex items-center space-x-2 w-full">
          <div className="flex-1">
            <textarea
              ref={textareaRef}
              rows={1}
              className="w-full bg-white px-4 py-2 resize-none focus:outline-none text-black placeholder-gray-500 focus:ring-2 focus:ring-blue-400 rounded-lg"
              
              placeholder="Type your Python code here..."
              value={pythonCode}
              onChange={(e) => setPythonCode(e.target.value)}
              onKeyDown={handleKeyPress}
              style={{ minHeight: '40px', maxHeight: '120px', color: '#000' }}
              disabled={isLoading}
            />
          </div>

          <button
            onClick={handleSubmit}
            disabled={isLoading || !pythonCode.trim()}
            className="bg-gradient-to-r from-blue-500 to-purple-500 hover:from-blue-600 hover:to-purple-600 text-white p-3 rounded-full transition-all duration-200 disabled:opacity-50 disabled:cursor-not-allowed flex items-center justify-center hover:scale-105"
          >
            {isLoading ? (
              <svg className="animate-spin h-5 w-5" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24">
                <circle className="opacity-25" cx="12" cy="12" r="10" stroke="currentColor" strokeWidth="4"></circle>
                <path className="opacity-75" fill="currentColor" d="M4 12a8 8 0 018-8V0C5.373 0 0 5.373 0 12h4zm2 5.291A7.962 7.962 0 014 12H0c0 3.042 1.135 5.824 3 7.938l3-2.647z"></path>
              </svg>
            ) : (
              <svg className="h-5 w-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M12 19l9 2-9-18-9 18 9-2zm0 0v-8"></path>
              </svg>
            )}
          </button>
        </div>
      </div>
    </div>
  );
}

export default CodeConverter;