dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

def dfs(x, y, h):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if (0 <= nx < n) and (0 <= ny < n):
            if arr[nx][ny] > h and visited[nx][ny] == 0:
                visited[nx][ny] = 1
                dfs(nx, ny, h)


n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

ans = 1
max_value = max(map(max. arr))

for k in range(1, max_value):
    cnt = 0
    visited = [[0] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            if arr[i][j] > k and visited[i][j] == 0:
                visited[i][j] = 1
                cnt += 1
                dfs(i, j, k)
                
    ans = max(ans, cnt)

print(ans)