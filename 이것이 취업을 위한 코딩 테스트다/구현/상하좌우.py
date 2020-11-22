N = int(input())

lst = list(input().split())

x, y = 1, 1
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move = ['L', 'R', 'U', 'D']

for value in lst:
    for i in range(len(move)):
        if value == move[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    x ,y = nx, ny

print(x, y)
        
        

