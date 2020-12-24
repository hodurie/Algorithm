from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(graph, x, y):
    q = deque()
    q.append((x, y))
    
    while q:
        x, y = q.popleft()
        
        graph[x][y] = 0
		
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
			
            if 0 <= nx < m and 0 <= ny < n:
                if graph[nx][ny] == 1:
                    q.append((nx, ny))
                    graph[nx][ny] = 0

tc = int(input())

for _ in range(tc):
    m, n, k = map(int, input().split())
    
    graph = [[0] * n for _ in range(m)]
    cnt = 0
    
    for i in range(k):
        x, y = map(int, input().split())
        graph[x][y] = 1
	
    if k == 1:
        print(1)
    else:
        for i in range(m):
            for j in range(n):
                if graph[i][j] == 1:
                    dfs(graph, i, j)
                    cnt += 1
        print(cnt)