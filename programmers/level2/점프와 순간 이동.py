def solution(n):
    cnt = 0
    while n != 0:
        if n % 2 == 0:
            n //= 2
        else:
            n -= 1
            n //= 2
            cnt += 1

    return cnt