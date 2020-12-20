n, m = map(int, input().split())

data = [0] * 11

weights = list(map(int, input().split()))

for weight in weights:
    data[weight] += 1
    
count = 0

for i in range(1, m+1):
    count += data[i] * sum(data[i+1:])

print(count)