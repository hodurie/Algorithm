n = int(input())
arr = list(map(int, input().split()))
dp = [1] * n

for i in range(1, n):
    res = []
    for j in range(i):
        if arr[i] < arr[j]:
            res.append(dp[j])
        
    if res:
        dp[i] += max(res)

print(max(dp))