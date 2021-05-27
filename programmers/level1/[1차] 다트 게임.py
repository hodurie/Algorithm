def solution(dartResult):
    d = dartResult
    a = 0
    p = 0
    res = []
    
    i = 0
    
    while i < len(d):
        if d[i].isdigit() and d[i+1].isdigit():
            a = p
            res.append(a)
            p = 10
            i += 1
        elif d[i].isdigit() and d[i+1].isalpha():
            a = p
            res.append(a)
            p = int(d[i])
        elif d[i] in 'SDT':
            idx = 'SDT'.index(d[i])
            p **= (idx+1)
        else:
            if d[i] == '*':
                res[-1] *= 2
                p *= 2
            else:
                p *= -1
        i += 1
        
    res.append(p)
    return sum(res)