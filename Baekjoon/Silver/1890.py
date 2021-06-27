n = int(input())
MAP = [list(map(int, input().split())) for _ in range(n)]
dx, dy = [1, 0], [0, 1]
dp = [[-1] * n for _ in range(n)]

def dfs(x, y):
    if x == n-1 and y == n-1:
        return 1

    if dp[x][y] != -1:
        return dp[x][y]

    v = MAP[x][y]
    dp[x][y] = 0
    
    for i in range(2):
        nx, ny = dx[i] * v + x, dy[i] * v + y
    
        if 0 <= nx < n and 0 <= ny < n:
            dp[x][y] += dfs(nx, ny)
    
    return dp[x][y]

print(dfs(0, 0))