import { useState, useEffect, useRef } from 'react';
import Message from './Message';
import LoadingIndicator from './LoadingIndicator';
import ChatInput from './ChatInput';
import Header from './Header';
import { convertPythonToJava } from '../services/api';
import { formatTimestamp } from '../utils/helpers';

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

  useEffect(() => {
    chatEndRef.current?.scrollIntoView({ behavior: 'smooth' });
  }, [chat]);

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
    }, 500);
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

  return (
    <div className="flex flex-col min-h-screen w-full bg-white text-gray-800 font-sans">
      <Header />

      {/* Main content area with padding to prevent content from hiding under input */}
      <div className="flex-1 overflow-y-auto p-4 pb-24 bg-white max-w-5xl mx-auto w-full">
        {chat.length === 0 && (
          <div className="flex items-center justify-center flex-col h-[50vh]">
            <div className="text-center">
              <h2 className="text-2xl font-medium mb-2">Welcome to Py2Ja Converter</h2>
              <p className="text-gray-500 max-w-md mx-auto">
                Enter your Python code below to convert it to Java.
              </p>
            </div>
          </div>
        )}

        {/* Regular chat messages */}
        {chat.map((entry) => (
          <div key={entry.id} className={`w-full mb-6 ${entry.type === 'user' ? 'flex justify-end' : 'flex justify-start'}`}>
            <div className={`max-w-[80%] ${entry.type === 'user' ? 'bg-blue-50' : 'bg-white'} p-4 rounded-2xl shadow-sm border border-gray-100`}>
              <Message 
                entry={entry} 
                copyStatus={copyStatus} 
                handleCopy={handleCopy}
                formatTimestamp={formatTimestamp}
              />
              <div className="text-xs text-gray-400 mt-2">
                {formatTimestamp(entry.timestamp)}
                {entry.status && <span> · {entry.status}</span>}
              </div>
            </div>
          </div>
        ))}

        {/* Loading indicator */}
        {isLoading && (
          <div className="w-full mb-6 flex justify-start">
            <div className="max-w-[80%] bg-white p-4 rounded-2xl shadow-sm border border-gray-100">
              <LoadingIndicator />
            </div>
          </div>
        )}
        
        <div ref={chatEndRef} className="h-4" />
      </div>

      {/* Input area - always at bottom */}
      <div className={`w-full ${chat.length === 0 ? 'static py-4' : 'fixed bottom-0 left-0 right-0 py-4'} px-4 bg-white border-t border-gray-200 shadow-sm z-10`}>
        <ChatInput 
          pythonCode={pythonCode}
          setPythonCode={setPythonCode}
          handleKeyPress={handleKeyPress}
          handleSubmit={handleSubmit}
          isLoading={isLoading}
          isEmpty={chat.length === 0}
        />
      </div>
    </div>
  );
}

export default CodeConverter;