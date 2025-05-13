function Header() {
  return (
    <header className="bg-white border-b border-gray-200 sticky top-0 z-10" style={{height: '60px'}}>
      <div className="flex w-full items-center h-full px-4 max-w-screen-xl mx-auto">
        <div className="flex items-center">
          {/* Logo */}
          <div className="mr-2 text-gray-800">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
              <circle cx="12" cy="12" r="10"></circle>
              <path d="M12 2a10 10 0 0 0-7 17h14a10 10 0 0 0-7-17Z"></path>
            </svg>
          </div>
          
          {/* App name */}
          <h1 className="text-xl font-medium text-gray-800">
            Py2Ja Converter
          </h1>
        </div>
      </div>
    </header>
  );
}

export default Header;