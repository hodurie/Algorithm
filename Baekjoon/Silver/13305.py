n = int(input())
dist = list(map(int, input().split()))
cities = list(map(int, input().split()))

min_value = cities[0]
res = 0
for i in range(n-1):
    if min_value > cities[i]:
        min_value = cities[i]
    res += min_value * dist[i]

print(res)