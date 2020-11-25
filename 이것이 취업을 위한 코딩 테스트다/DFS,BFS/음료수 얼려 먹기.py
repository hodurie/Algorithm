N, M = map(int, input().split())

graph = []

for i in range(N):
    graph.append(list(map(int, input().split())))
    

def dfs(x, y):
    
    if x <= -1 or x >= N or y <= -1 or y >= M:
        return False
    
    if graph[x][y] == 0:
        graph[x][y] = 1
        
        dfs(x + 1, y)
        dfs(x - 1, y)
        dfs(x, y + 1)
        dfs(x, y - 1)
        return True
    
    return False

res = 0
for i in range(M):
    for j in range(N):
        if dfs(i, j):
            res += 1

print(res)
        
