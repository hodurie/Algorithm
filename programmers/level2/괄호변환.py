def isCorrect(p):
    cnt = 0
    for s in p:
        if s == '(':
            cnt += 1
        else:
            cnt -= 1
        if cnt < 0:
            return False
    
    return True

def isBalanced(p):
    return p.count('(') == p.count(')')

def solution(p):
    u, v = '', ''
    if isCorrect(p):
        return p
    
    for i in range(2, len(p)+1, 2):
        if isBalanced(p[:i]):
            u += p[:i]
            v += p[i:]
            break
    
    if isCorrect(u):
        return u + solution(v)
    else:
        u = ''.join(['(' if i == ')' else ')' for i in u[1:-1]])
        return '(' + solution(v) + ')' + u