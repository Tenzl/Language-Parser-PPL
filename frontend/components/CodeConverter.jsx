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

  return (
    <div className="flex flex-col h-screen w-full bg-gray-900 text-white font-sans">
      <Header />

      {/* Messages */}
      <div className="flex-1 p-2 overflow-y-auto space-y-4 bg-gray-900">
        {chat.map((entry) => (
          <div key={entry.id} className="space-y-2">
            <Message 
              entry={entry} 
              copyStatus={copyStatus} 
              handleCopy={handleCopy}
              formatTimestamp={formatTimestamp}
            />
          </div>
        ))}

        {/* Loading */}
        {isLoading && <LoadingIndicator />}
        <div ref={chatEndRef} />
      </div>

      <ChatInput 
        pythonCode={pythonCode}
        setPythonCode={setPythonCode}
        handleKeyPress={handleKeyPress}
        handleSubmit={handleSubmit}
        isLoading={isLoading}
      />
    </div>
  );
}

export default CodeConverter;