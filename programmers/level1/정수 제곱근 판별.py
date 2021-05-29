def solution(n):
    num = int(n**0.5)
    if n == int(n**0.5) ** 2:
        return (num + 1) ** 2
    return -1