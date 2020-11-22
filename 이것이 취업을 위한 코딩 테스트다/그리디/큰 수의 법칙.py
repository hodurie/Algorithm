N, M, K = map(int, input().split())

lst = list(map(int, input().split()))
lst.sort()

cnt, res = 0, 0

cnt += (M // (K+1)) * K
cnt += M % (K+1)

res += cnt * lst[N-1]
res += lst[N-2] * (M - cnt)
print(res)