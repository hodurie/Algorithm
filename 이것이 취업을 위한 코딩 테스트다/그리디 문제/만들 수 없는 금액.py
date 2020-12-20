n = int(input())

result = 1

coins = list(map(int, input().split()))

for coin in coins:
    if result < coin:
        break
    result += coin        
        
print(result)