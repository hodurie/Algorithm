def fuc(x):
    visited[x] = True
    
    for i in graph[x]:
        if visited[i] == False:
            fuc(i)

n, m = map(int, input().split())

graph = [[] for i in range(n+1)]

for i in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
    
visited = [False] * (n+1)
count = 0

for i in range(1, n+1):
    if visited[i] == False:
        fuc(i)
        count += 1
            
print(count)