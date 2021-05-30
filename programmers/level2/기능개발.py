import math

def solution(progresses, speeds):
    res = [math.ceil((100 - a) / b) for a, b in zip(progresses, speeds)]
    
    res = res[::-1]
    
    cnt = 1
    answer = []
    
    a = res.pop()
    while res: 
        if res[-1] <= a:
            cnt += 1
            res.pop()
        else:
            a = res.pop()
            answer.append(cnt)
            cnt = 1
            
    answer.append(cnt)
            
    return answer