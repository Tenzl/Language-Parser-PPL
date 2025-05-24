const API_BASE_URL = 'http://localhost:8000';

// Map frontend commands to backend commands
const mapCommand = (command) => {
  const cmd = command.toLowerCase().trim();
  
  if (cmd.includes('grammar') || cmd.includes('tree')) {
    return 'showgrammar';
  }
  if (cmd.includes('output') || cmd.includes('run')) {
    return 'showoutput';
  }
  if (cmd.includes('save')) {
    return 'savecode';
  }
  if (cmd.includes('show') && cmd.includes('code')) {
    return 'showsavedcode';
  }
  if (cmd.includes('java') && cmd.includes('python')) {
    return 'javatopy';
  }
  if (cmd.includes('python') && cmd.includes('java')) {
    return 'pytojava';
  }
  
  return command; // Return original if no mapping found
};

export const convertCode = async (code, conversationId = null) => {
  try {
    const response = await fetch(`${API_BASE_URL}/convert`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ 
        code,
        conversation_id: conversationId 
      }),
    });

    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }

    const data = await response.json();
    
    // Handle error responses from backend
    if (data.error) {
      return {
        result: {
          error: data.error,
          type: data.type || 'error'
        },
        type: 'error',
        message: '',
        conversationId: data.conversation_id || conversationId
      };
    }
    
    return {
      result: data.result || data.converted_code || 'Conversion completed successfully',
      type: data.type || 'converted_code',
      message: data.message || '',
      conversationId: data.conversation_id,
      direction: data.direction
    };
  } catch (error) {
    console.error('Error converting code:', error);
    
    // Fallback for demo purposes
    if (code.toLowerCase().includes('python') || code.toLowerCase().includes('java')) {
      return {
        result: `// Converted code (demo mode - API not available)
${code}

// Note: This is a demo response. 
// Connect to your backend API for actual code conversion.`,
        type: 'converted_code',
        message: 'Demo mode response',
        conversationId: conversationId
      };
    }
    
    throw error;
  }
};

export const getConversationContext = async (conversationId) => {
  try {
    const response = await fetch(`${API_BASE_URL}/conversation/${conversationId}/context`);
    
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    
    return await response.json();
  } catch (error) {
    console.error('Error getting conversation context:', error);
    return null;
  }
}; 