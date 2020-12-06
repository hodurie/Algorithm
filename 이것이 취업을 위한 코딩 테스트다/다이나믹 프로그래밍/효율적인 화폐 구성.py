n, m = map(int, input().split())

coins = []

for i in range(n):
    coins.append(int(input()))
    
count = [10001] * (m + 1)
count[0] = 0

for i in range(n):
    for j in range(coins[i], m + 1):
        if count[j - coins[i]] != 10001:
            count[j] = min(count[j - coins[i]] + 1, count[j])
            
if count[m] == 10001:
    print(-1)
else:
    print(count[m])