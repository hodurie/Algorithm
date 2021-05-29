def prime_number(n):
    if n == 1:
        return False
    
    if n == 2:
        return True
    
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

def solution(n):
    cnt = 0
    for i in range(1, n+1):
        if prime_number(i):
            cnt += 1           
    return cnt