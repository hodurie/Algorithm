def solution(n):
    num = bin(n)[2:]
    print(num, type(num))
    cnt = num.count('1')

    for i in range(n + 1, 2*n):
        if bin(i)[2:].count('1') == cnt:
            return i