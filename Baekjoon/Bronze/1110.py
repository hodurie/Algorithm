N = int(input())

cnt = 0
n = N

while True:
    mok = n // 10
    na = n % 10
    hap = mok + na
    hap %= 10
    n = na * 10 + hap
    cnt += 1    
    if n == N:
        break
print(cnt)