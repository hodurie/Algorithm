from itertools import combinations

n = int(input())

MAP = []

for _ in range(n):
    MAP.append(list(map(int, input().split())))

M = 1e9

for c in combinations(range(n), n//2):
    t1 = 0
    t2 = 0

    A = [i for i in range(n) if i not in c]
    for i in c:
        for j in c:
            t1 += MAP[i][j]

    for i in A:
        for j in A:
            t2 += MAP[i][j]
            
    diff = abs(t1 - t2)
    if diff < M:
        M = diff

print(M)