from collections import deque

N, K = map(int, input().split())
MAP = []
virus = []

for i in range(N):
    MAP.append(list(map(int, input().split())))
    for j in range(N):
        if MAP[i][j] != 0:
            virus.append((MAP[i][j], i, j, 0))

S, X, Y = map(int, input().split())

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

virus.sort()
q = deque(virus)

while q:
    v, x, y, time = q.popleft()

    if time == S:
        break

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 < nx < N and 0 < ny < N:
            if MAP[nx][ny] == 0:
                MAP[nx][ny] = v
                q.append((v, nx, ny, time + 1))

print(MAP[X-1][Y-1])
