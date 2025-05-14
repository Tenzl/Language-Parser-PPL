saved_code = None
saved_tree = None

import subprocess
def save_code(code, tree):
    global saved_code, saved_tree
    saved_code = code
    saved_tree = tree

def get_code():
    global saved_code, saved_tree
    return saved_code, saved_tree

def run_code(code):
    try:
        with open('script.py', 'w') as f:
            f.write(code)
        # Execute the code in a new Python process
        result = subprocess.run(
            ['python', 'script.py'],
            capture_output=True,
            text=True
        )
        return result.stdout
    except Exception as e:
        return str(e)


