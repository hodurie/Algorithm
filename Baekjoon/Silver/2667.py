N = int(input())

data = []

dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]

count = []

for i in range(N):
    data.append(list(map(int, input().split())))
    
def bfs(x, y):
    queue = [[x, y]]
    data[x][y] = 0
    
    number = 1
    
    while queue:
        a, b = queue[0][0], queue[0][1]
        del queue[0]
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]
            if 0 <= nx < N and 0 <= ny < N and data[nx][ny] == 1:
                data[nx][ny] = 1
                queue.append([nx, ny])
                number += 1
    count.append(number)

for i in range(N):
    for j in range(N):
        if data[i][j] == 1:
            bfs(i, j)
count.sort()

print(len(count))

for i in count:
    print(i)