def solution(s):
    res = [0, 0]
    while len(s) != 1:
        zero = s.count('0')
        s = s.replace('0', '')
        n = len(s)
        s = bin(n)[2:]

        res[0] += 1
        res[1] += zero

    return res