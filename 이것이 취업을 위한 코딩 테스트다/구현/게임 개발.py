N, M = map(int, input().split())
A, B, d = map(int, input().split())

check = [[0] * N for i in range(M)]
check[A][B] = 1

data = []

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

for i in range(M):
    data.append(list(map(int, input().split())))

def turn_left():
    global d
    d -= 1
    if d == -1:
        d = 3
    
cnt = 1
turn = 0

while True:
    turn_left()
    
    x = A + dx[d]
    y = B + dy[d]
    
    if data[x][y] == 0 and check[x][y] == 0:
        cnt += 1
        check[x][y] = 1
        A = x
        B = y
        turn = 0
        continue
    
    else:
        turn += 1
        
    if turn == 4:
        x = A - dx[d]
        y = B - dy[d]
        
        if data[x][y] == 0:
            A = x
            B = y
        else:
            break
        turn = 0

print(cnt)