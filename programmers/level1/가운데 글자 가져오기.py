def solution(s):
    n = len(s)
    
    if n % 2 == 0:
        n = int(n/2)
        return s[n-1] + s[n]
    else:
        return s[int(n/2)]