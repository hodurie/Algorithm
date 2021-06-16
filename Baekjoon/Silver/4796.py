cnt = 0

while True:
    cnt += 1
    l, p, v = map(int, input().split())

    if l == 0 or p == 0 or v == 0:
        break

    res = 0
    m = v // p
    res = l * m
    res += l if v % p > l else (v % p)

    print('Case %d: %d'%(cnt, res))