from collections import deque
import re

def check(string):
    chk1 = 0
    chk2 = 0
    total = 0

    for s in string:
        if s == '[':
            chk1 += 1
        elif s == ']':
            chk1 -= 1
        elif s == '(':
            chk2 += 1
        elif s == ')':
            chk2 -= 1

        if chk1 < 0 or chk2 < 0:
            return False
    if chk1 != 0 or chk2 != 0:
        return False
    
    return True
           
def is_balanced(string):
    q = deque(string)
    res = []
    while q:
        v = q.popleft()

        if v == '(' or v == '[':
            res.append(v)
        else:
            if v == ')':
                if res[-1] == '(':
                    res.pop()
            else:
                if res[-1] == '[':
                    res.pop()
    if res:
        return False
    else:
        return True


while True:
    s = input()[:-1]
    if len(s) == 0:
        break
    
    pattern = re.compile('[a-z|A-Z| ]')
    temp = re.sub(pattern, '', s)

    if check(temp) and is_balanced(temp):
        print('yes')
    else:
        print('no')