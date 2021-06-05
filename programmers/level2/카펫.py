def solution(brown, yellow):
    n = brown + yellow
    if int(n**0.5) == n**0.5:
        return [n**0.5] * 2
    
    for i in range(1, yellow//2 +1):
        if yellow % i == 0:
            if 2 * (i + yellow // i) + 4 == brown:
                return [yellow//i + 2, i + 2]