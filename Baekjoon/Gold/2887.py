import sys

n = int(sys.stdin.readline())
parent = [i for i in range(n)]
coord = []
edges = []

for i in range(n):
    x, y, z = list(map(int, sys.stdin.readline().split()))
    coord.append((x, y, z, i))

for i in range(3):
    coord.sort(key=lambda x : x[i])
    for j in range(1, n):
        edges.append((abs(coord[j-1][i] - coord[j][i]), coord[j-1][3], coord[j][3]))

edges.sort()

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
    cost, a, b = edge
    if find(parent, a) != find(parent, b):
        union(parent, a, b)
        result += cost

print(result)
