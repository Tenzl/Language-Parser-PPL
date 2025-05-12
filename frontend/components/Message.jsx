import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { vscDarkPlus } from 'react-syntax-highlighter/dist/esm/styles/prism';
import { CopyToClipboard } from 'react-copy-to-clipboard';

function Message({ entry, copyStatus, handleCopy, formatTimestamp }) {
  if (entry.sender === 'user') {
    return (
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
    );
  } else {
    return (
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
    );
  }
}

export default Message; 