def solution(n):
    fibo = [0 for i in range(n+1)]
    fibo[1] = 1
    
    if n == 1:
        return 1
    
    for i in range(2, n+1):
        fibo[i] = fibo[i-2] + fibo[i-1]
    
    return fibo[n] % 1234567