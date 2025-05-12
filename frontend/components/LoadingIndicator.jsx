function LoadingIndicator() {
  return (
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
  );
}

export default LoadingIndicator; 