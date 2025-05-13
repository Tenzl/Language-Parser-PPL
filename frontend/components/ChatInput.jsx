import { useRef, useEffect } from 'react';

function ChatInput({ pythonCode, setPythonCode, handleKeyPress, handleSubmit, isLoading, isEmpty }) {
  const textareaRef = useRef(null);

  useEffect(() => {
    if (textareaRef.current) {
      textareaRef.current.style.height = 'auto';
      textareaRef.current.style.height = `${Math.min(textareaRef.current.scrollHeight, 100)}px`;
    }
  }, [pythonCode]);

  return (
    <div className="w-full max-w-3xl mx-auto">
      <div className="relative bg-white rounded-2xl border border-gray-200 shadow-sm hover:shadow-md transition-shadow">
        <textarea
          ref={textareaRef}
          rows={1}
          className="w-full bg-white px-4 py-3 pr-12 resize-none focus:outline-none text-gray-700 placeholder-gray-500 rounded-2xl"
          placeholder="Start a conversation in this workspace"
          value={pythonCode}
          onChange={(e) => setPythonCode(e.target.value)}
          onKeyDown={handleKeyPress}
          style={{ minHeight: '52px', maxHeight: '120px' }}
          disabled={isLoading}
        />
        
        <button
          onClick={handleSubmit}
          disabled={isLoading || !pythonCode.trim()}
          className={`absolute right-2 bottom-2.5 p-2 rounded-full flex items-center justify-center ${pythonCode.trim() ? 'bg-green-600 hover:bg-green-700' : 'bg-gray-200'} text-white transition-colors`}
          aria-label="Send message"
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