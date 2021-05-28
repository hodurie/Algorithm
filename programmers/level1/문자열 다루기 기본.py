import re

def solution(s):
    if len(s) == 4 or len(s) == 6:
        if len(re.findall(re.compile('[0-9]'), s)) != len(s):
            return False
        return True
    
    return False