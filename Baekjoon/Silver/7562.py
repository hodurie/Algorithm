from collections import deque

steps = [(1, 2), (1, -2), (-1, 2), (-1, -2), (2, 1), (2, -1), (-2, 1), (-2, -1)]

def bfs(start_x, start_y):
    queue = deque()
    queue.append([start_x, start_y])
    
    while queue:
        x, y = queue.popleft()
        if x == end_x and y == end_y:
            print(mat[x][y])
            break
        
        for dx, dy in steps:
            nx = x + dx
            ny = y + dy
            if -1 < nx < length and -1 < ny < length and mat[nx][ny] == 0:
                queue.append([nx, ny])
                mat[nx][ny] = mat[x][y] + 1
            
tc = int(input())

for t in range(tc):
    count = 0
    length = int(input())
    start_x, start_y = map(int, input().split())
    end_x, end_y = map(int, input().split())
    
    mat = [[0] * length for _ in range(length)]
    
    bfs(start_x, start_y)