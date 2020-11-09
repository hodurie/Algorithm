N, M = map(int, input().split())

lst = []

for _ in range(N):
    lst.append(input())

row = [0] * N
col = [0] * M

for i in range(N):
    for j in range(M):
        if lst[i][j] == "X":
            row[i] = 1
            col[j] = 1
            
row_cnt = 0
for i in range(N):
    if row[i] == 0:
        row_cnt += 1
        
col_cnt = 0
for i in range(M):
    if col[i] == 0:
        col_cnt += 1

print(max(row_cnt, col_cnt))