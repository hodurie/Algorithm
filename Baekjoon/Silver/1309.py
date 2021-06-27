n = int(input())
arr = [0] * (100001)
dp = [0] * (100001)

dp[0] = 1
dp[1] = 3

for i in range(2, n+1):
    dp[i] = (dp[i-2] + 2*(dp[i-1])) % 9901

print(dp[n])