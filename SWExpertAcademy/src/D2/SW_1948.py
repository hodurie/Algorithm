days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

T = int(input())

for t in range(1, T+1):
    m1, d1, m2, d2 = map(int, input().split())
    N = 0
    if(m1 == m2):
        N = d2 - d1 + 1
    else:
        for i in range(m1, m2+1):
            if(i == m1):
                N += days[i] - d1 + 1
            elif(i == m2):
                N += d2
            else:
                N += days[i]
    print(f"#{t} {N}")