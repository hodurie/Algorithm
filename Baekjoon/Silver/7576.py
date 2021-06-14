from collections import deque

# m : 가로(y), n : 세로(x)
m, n = map(int, input().split())

mat = [list(map(int, input().split())) for i in range(n)]
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

q = deque()

for x in range(n):
    for y in range(m):
        if mat[x][y] == 1:
            q.append((x, y))

def bfs():
    cnt = 0
    while q:
        cnt += 1
        for _ in range(len(q)):
            x, y = q.popleft()
            for i in range(4):
                nx = dx[i] + x
                ny = dy[i] + y
                if nx < 0 or ny < 0 or nx >= n or ny >= m:
                    continue

                if mat[nx][ny] == 0:
                    mat[nx][ny] = 1
                    mat[nx][ny] = mat[x][y] + 1
                    q.append((nx, ny))

    for i in range(n):
        for j in range(m):
            if mat[i][j] == 0:
                return -1

    return cnt - 1

print(bfs())
