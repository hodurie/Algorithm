import re

def solution(s):
    p1 = re.compile('[A-Z]')
    p2 = re.compile('[a-z]')
    upper = re.findall(p1, s)
    lower = re.findall(p2, s)
    
    upper.sort(reverse=True)
    lower.sort(reverse=True)
    
    return ''.join(lower+upper)