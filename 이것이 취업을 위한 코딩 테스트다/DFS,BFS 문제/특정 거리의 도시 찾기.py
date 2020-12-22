from collections import deque

n, m, k, x = map(int, input().split())

graph = [[] for i in range(n+1)]
dist = [-1] * (n + 1)
dist[x] = 0

for i in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    
    
q = deque([x])
    
while q:
    now = q.popleft()
    
    for i in graph[now]:
        if dist[i] == -1:
            dist[i] = dist[now] + 1
            q.append(i)


flag = True

for i in range(1, n+1):
    if dist[i] == k:
        flag = False
        print(i)

if flag:
    print(-1)