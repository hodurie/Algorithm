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
path = []

for i in range(1, n+1):
    city[i] = i
    
for i in range(m):
    a, b, cost = map(int, input().split())
    
    path.append((cost, a, b))

path.sort()
result = 0
last = 0

for p in path:
    cost, a, b = p
    
    if find_path(city, a) != find_path(city, b):
        union_city(city, a, b)
        result += cost
        last = cost
        
print(result - last)