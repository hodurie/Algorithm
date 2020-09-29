N = int(input())

cnt = 99

if N < 100:
    print(N)
else:
    for i in range(100, N + 1):
        a = i // 100
        b = (i // 10) % 10
        c = i % 10
        
        if (a - b) == (b - c):
            cnt += 1
    print(cnt)