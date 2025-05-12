export const convertPythonToJava = async (python) => {
  try {
    const res = await fetch('http://localhost:8000/convert', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ python_code: python.trim() + '\n' }),
    });
    const data = await res.json();
    if (data.error) {
      return `Error: ${Array.isArray(data.error) ? data.error.join('\n') : data.error}`;
    }
    return data.java_code || '// No output.';
  } catch (error) {
    return 'Error: Could not connect to the server. Please try again.';
  }
}; 