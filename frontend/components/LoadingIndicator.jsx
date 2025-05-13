function LoadingIndicator() {
  return (
    <div className="flex justify-start mb-6">
      <div className="flex flex-col items-start max-w-[85%]">
        <div className="chat-message-bot p-4 rounded-t-xl rounded-br-xl shadow-lg">
          <div className="flex space-x-2 items-center">
            <div className="flex space-x-1">
              <div className="w-2 h-2 rounded-full bg-blue-400 animate-pulse shadow-[0_0_8px_rgba(59,130,246,0.5)]" style={{animationDelay: '0ms'}}></div>
              <div className="w-2 h-2 rounded-full bg-purple-400 animate-pulse shadow-[0_0_8px_rgba(168,85,247,0.5)]" style={{animationDelay: '200ms'}}></div>
              <div className="w-2 h-2 rounded-full bg-pink-400 animate-pulse shadow-[0_0_8px_rgba(236,72,153,0.5)]" style={{animationDelay: '400ms'}}></div>
            </div>
            <span className="text-sm text-gray-400">Converting to Java...</span>
          </div>
        </div>
      </div>
    </div>
  );
}

export default LoadingIndicator; 