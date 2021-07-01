num = [0] + list(map(int, input()))
n = len(num)

dp = [0] * (n + 1)
dp[0], dp[1] = 1, 1

if num[1] == 0:
    print(0)
else:
    for i in range(2, n):
        a = num[i]
        b = num[i-1] * 10 + num[i]
        if a > 0:
            dp[i] += dp[i-1]
        if 10 <= b <= 26:
            dp[i] += dp[i-2]
        
        dp[i] %= 1000000

    print(dp[n-1])