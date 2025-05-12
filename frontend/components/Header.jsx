function Header() {
  return (
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
  );
}

export default Header; 