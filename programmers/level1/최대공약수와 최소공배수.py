def solution(n, m):
    N = set([n] + [i for i in range(1, n // 2 + 1) if n % i == 0])
    M = set([m] + [i for i in range(1, m // 2 + 1) if m % i == 0])
    
    a = max(N.intersection(M))
    b = (n * m)/a

    return [a, b]