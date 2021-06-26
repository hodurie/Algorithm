def convert(number, n):
    string = '0123456789ABCDEF'
    string = string[:n]

    s = ''
    while number > 0:
        a, b = divmod(number, n)
        s += string[b]
        number = a
    return s[::-1]


def solution(n, t, m, p):
    s = '01'
    number = 2

    while len(s) <= m * t:
        s += convert(number, n)
        number += 1

    res = ''

    for i in range(p-1, m * t, m):
        res += s[i]

    return res