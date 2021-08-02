n, m = int(input()), int(input())

edges = []
parent = [0] * (n+1)

for i in range(1, n+1):
    parent[i] = i

for _ in range(m):
    edges.append(tuple(map(int, input().split())))

edges.sort(key=lambda x : x[2])

def find(parent, x):
    if parent[x] != x:
        parent[x] = find(parent, parent[x])
    return parent[x]

def union(parent, a, b):
    a = find(parent, a)
    b = find(parent, b)
    if a > b:
        parent[a] = b
    else:
        parent[b] = a

result = 0

for edge in edges:
    a, b, cost = edge
    if find(parent, a) != find(parent, b):
        union(parent, a, b)
        result += cost

print(result)