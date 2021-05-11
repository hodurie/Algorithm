N = int(input())

t, p = [], []

for i in range(N):
    a, b = map(int, input().split())
    t.append(a)
    p.append(b)
        
dp = [0]*(N+1)

for i in range(N):
    if dp[i] > dp[i+1]:
        dp[i+1] = dp[i]
    if dp[i+t[i]] < dp[i] + p[i]:
        dp[i+t[i]] = dp[i] + p[i]
        
print(dp[N])