import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { vscDarkPlus } from 'react-syntax-highlighter/dist/esm/styles/prism';
import { CopyToClipboard } from 'react-copy-to-clipboard';

function Message({ entry, copyStatus, handleCopy, formatTimestamp }) {
  if (entry.sender === 'user') {
    return (
      <div className="flex justify-end mb-6">
        <div className="flex flex-col items-end max-w-[85%]">
          <div className="chat-message-user p-4 rounded-xl shadow-md bg-blue-50 border border-blue-100">
            <div className="flex justify-between items-center mb-2">
              <span className="text-xs font-semibold uppercase text-blue-300">Python</span>
              <CopyToClipboard text={entry.python} onCopy={() => handleCopy(entry.id, 'python')}>
                <button className="text-xs text-gray-300 hover:text-blue-400 transition flex items-center space-x-1">
                  <svg xmlns="http://www.w3.org/2000/svg" className="h-3.5 w-3.5" viewBox="0 0 20 20" fill="currentColor">
                    <path d="M8 3a1 1 0 011-1h2a1 1 0 110 2H9a1 1 0 01-1-1z" />
                    <path d="M6 3a2 2 0 00-2 2v11a2 2 0 002 2h8a2 2 0 002-2V5a2 2 0 00-2-2 3 3 0 01-3 3H9a3 3 0 01-3-3z" />
                  </svg>
                  <span>{copyStatus.id === entry.id && copyStatus.type === 'python' ? 'Copied!' : 'Copy'}</span>
                </button>
              </CopyToClipboard>
            </div>
            <div className="rounded-md overflow-hidden shadow-[0_0_10px_rgba(59,130,246,0.3)]">
              <SyntaxHighlighter 
                language="python" 
                style={vscDarkPlus} 
                customStyle={{ 
                  borderRadius: '0.5rem', 
                  margin: 0, 
                  backgroundColor: '#1a1a2e',
                  maxHeight: '400px',
                  overflowY: 'auto',
                }}
              >
                {entry.python}
              </SyntaxHighlighter>
            </div>
          </div>
          <div className="flex items-center space-x-2 mt-1 text-xs text-gray-400">
            <span>{formatTimestamp(entry.timestamp)}</span>
            {entry.status && <span>{entry.status}</span>}
          </div>
        </div>
      </div>
    );
  } else {
    return (
      <div className="flex justify-start mb-6">
        <div className="flex flex-col items-start max-w-[85%]">
          <div className="chat-message-bot p-4 rounded-xl shadow-md bg-white border border-gray-100">
            {entry.java.includes('Error') ? (
              <p className="text-red-400">{entry.java}</p>
            ) : entry.java.startsWith('Hey') || entry.java.startsWith('//') ? (
              <p className="text-blue-50 leading-relaxed">{entry.java}</p>
            ) : (
              <>
                <div className="flex justify-between items-center mb-2">
                  <span className="text-xs font-semibold uppercase text-green-300">Java</span>
                  <CopyToClipboard text={entry.java} onCopy={() => handleCopy(entry.id, 'java')}>
                    <button className="text-xs text-gray-300 hover:text-green-400 transition flex items-center space-x-1">
                      <svg xmlns="http://www.w3.org/2000/svg" className="h-3.5 w-3.5" viewBox="0 0 20 20" fill="currentColor">
                        <path d="M8 3a1 1 0 011-1h2a1 1 0 110 2H9a1 1 0 01-1-1z" />
                        <path d="M6 3a2 2 0 00-2 2v11a2 2 0 002 2h8a2 2 0 002-2V5a2 2 0 00-2-2 3 3 0 01-3 3H9a3 3 0 01-3-3z" />
                      </svg>
                      <span>{copyStatus.id === entry.id && copyStatus.type === 'java' ? 'Copied!' : 'Copy'}</span>
                    </button>
                  </CopyToClipboard>
                </div>
                <div className="rounded-md overflow-hidden shadow-[0_0_10px_rgba(74,222,128,0.3)]">
                  <SyntaxHighlighter 
                    language="java" 
                    style={vscDarkPlus} 
                    customStyle={{ 
                      borderRadius: '0.5rem', 
                      margin: 0, 
                      backgroundColor: '#1a1a2e',
                      maxHeight: '400px',
                      overflowY: 'auto',
                    }}
                  >
                    {entry.java}
                  </SyntaxHighlighter>
                </div>
              </>
            )}
          </div>
          <div className="flex items-center space-x-2 mt-1 text-xs text-gray-400">
            <span>{formatTimestamp(entry.timestamp)}</span>
          </div>
        </div>
      </div>
    );
  }
}

export default Message;