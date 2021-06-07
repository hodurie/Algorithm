N = int(input())

def binary(n):
    n = int(n)
    s = ''
    while True:
        a, b = divmod(n, 2)
        s += str(b)
        if a == 0:
            break

        if a // 2 == 0:
            s += str(a)
            break
        n //= 2
    return s


for i in range(N):
    a, b, c = input().split(':')
    hour = binary(a)
    hour += ''.join(['0' for _ in range(6 - len(hour))])
    min = binary(b)
    min += ''.join(['0' for _ in range(6 - len(min))])
    sec = binary(c)
    sec += ''.join(['0' for _ in range(6 - len(sec))])

    hour, min, sec = hour[::-1], min[::-1], sec[::-1]
    answer = ''
    for i in range(6):
        answer += hour[i] + min[i] + sec[i]
    
    print(answer, end = " ")
    print(hour + min + sec)