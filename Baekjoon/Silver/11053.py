n = int(input())
sequence = list(map(int, input().split()))

dp = [0] * n

for i in range(n):
    min_value = 0
    for j in range(i):
        if(sequence[i] > sequence[j]):
            min_value = max(min_value, dp[j])
    dp[i] = min_value + 1
print(max(dp))