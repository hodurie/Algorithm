from collections import deque

m, n = map(int, input().split())
mat = [list(input()) for _ in range(n)]
check = [[False] * m for _ in range(n)]
w, b = 0, 0

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    q = deque()
    q.append((x, y))
    cnt = 1
    check[x][y] = True

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = dx[i] + x
            ny = dy[i] + y

            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue

            if check[nx][ny] == False:
                if mat[nx][ny] == mat[x][y]:
                    q.append((nx, ny))
                    check[nx][ny] = True
                    cnt += 1
    return cnt


for i in range(n):
    for j in range(m):
        if check[i][j] == False:
            res = bfs(i, j)
            if mat[i][j] == 'W':
                w += res ** 2
            else:
                b += res ** 2
print(w, b)
