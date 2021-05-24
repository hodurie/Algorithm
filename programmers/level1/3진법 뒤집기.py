def solution(n):
    answer = ''
    
    while True:
        a, b = divmod(n, 3)
        answer += str(b)
        
        if a == 0:
            break
        
        if a // 3 == 0:
            answer += str(a)
            break
            
        n //= 3
    
    answer = str(int(answer))
        
    return sum([int(s) * 3 ** idx for idx, s in enumerate(answer[::-1])])