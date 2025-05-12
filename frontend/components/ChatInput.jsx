import { useRef, useEffect } from 'react';

function ChatInput({ pythonCode, setPythonCode, handleKeyPress, handleSubmit, isLoading }) {
  const textareaRef = useRef(null);

  useEffect(() => {
    if (textareaRef.current) {
      textareaRef.current.style.height = 'auto';
      textareaRef.current.style.height = `${Math.min(textareaRef.current.scrollHeight, 120)}px`;
    }
  }, [pythonCode]);

  return (
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
  );
}

export default ChatInput; 