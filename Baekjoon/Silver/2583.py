from collections import deque
# m : 세로(x), n : 가로(y), k : 직사각형 개수
m, n, k = map(int, input().split())
mat = [[0] * n for _ in range(m)]
for i in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for y in range(x1, x2):
        for x in range(y1, y2):
            if mat[x][y] == 1:
                continue
            else:
                mat[x][y] = 1

res = []
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]


def bfs(x, y):
    q = deque()
    q.append((x, y))
    res = 1
    mat[x][y] = 1

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = dx[i] + x
            ny = dy[i] + y

            if 0 <= nx < m and 0 <= ny < n:
                if mat[nx][ny] == 0:
                    res += 1
                    mat[nx][ny] = 1
                    q.append((nx, ny))
    return res


for x in range(m):
    for y in range(n):
        if mat[x][y] == 0:
            res.append(bfs(x, y))

print(len(res))
for i in sorted(res):
    print(i, end=' ')
