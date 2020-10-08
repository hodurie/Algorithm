N = int(input())

lst = list(map(int, input().split()))
res = 0

for i in lst:
    if i != 1:
        cnt = 0
        for j in range(2, i + 1):
            if (i % j) == 0:
                cnt += 1
        if cnt == 1:
            res += 1

print(res)