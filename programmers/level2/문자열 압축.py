def solution(s):
    n = len(s)
    
    if n == 1:
        return 1
    
    answer = ""
    prev = ""
    
    for i in range(1, (n//2) + 1):
        cnt = 1
        temp = s[:i]
        for j in range(i, n + 1, i):
            if temp == s[j:j+i]:
                cnt += 1
            else:
                if cnt == 1:
                    answer += temp
                else:
                    answer += str(cnt) + temp
                temp = s[j:j+i]
                cnt = 1
                
        if cnt == 1:                
            answer += temp
        else:
            answer += str(cnt) + temp
        
        if len(prev) == 0:
            prev = answer
        elif len(answer) < len(prev):
            prev = answer
            
        answer = ""
    
    return n if len(prev) > n else len(prev)