def find_path(city, x):
    if city[x] != x:
        city[x] = find_path(city, city[x])
    return city[x]

def union_city(city, a, b):
    a = find_path(city, a)
    b = find_path(city, b)
    
    if a < b:
        city[b] = a
    else:
        city[a] = b
        
n, m = map(int, input().split())

city = [0] * (n+1)

paths = []
result = 0

for i in range(1, n+1):
    city[i] = i

for _ in range(m):
    a, b, cost = map(int, input().split())
    paths.append((cost, a, b))
    
paths.sort()
last = 0

for path in paths:
    cost, a, b = path
    
    if find_path(city, a) != find_path(city, b):
        union_city(city, a, b)
        result += cost
        last = cost
        
print(result - last)
