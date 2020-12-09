n, k = map(int, input().split())

coins = []

for i in range(n):
    coins.append(int(input()))

numbers = [0] * (k + 1)
numbers[0] = 1

for i in range(n):
    for j in range(1, k + 1):
        if j - coins[i] >= 0:
            numbers[j] += numbers[j - coins[i]]

print(numbers[k])