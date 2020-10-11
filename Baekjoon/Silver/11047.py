N, K = map(int, input().split())
lst = []
cnt = 0

for _ in range(N):
    lst.append(int(input()))

lst.sort(reverse = True)

for i in lst:
    if K // i >= 1:
        cnt += K // i
        K -= (K//i) * i
print(cnt)