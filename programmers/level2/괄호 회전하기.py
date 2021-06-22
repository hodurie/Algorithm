def isCorrect(s):
    if s[0] in ')}]':
        return False
    
    res = []
    for i in s:
        if i in '({[':
            res.append(i)
        elif i in ')}]':
            if res:
                if i == ')':
                    temp = res.pop()
                    if temp != '(':
                        res.append(temp)
                if i == ']':
                    temp = res.pop()
                    if temp != '[':
                        res.append(temp)
                if i == '}':
                    temp = res.pop()
                    if temp != '{':
                        res.append(temp)
                        
            else:
                return False
    
    if res:
        return False
    else:
        return True

def solution(s):
    if len(s) % 2 != 0:
        return 0
    
    cnt = 0
    for i in range(len(s)):
        if isCorrect(s):
            cnt += 1
        s = s[1:] + s[0]
        
    return cnt