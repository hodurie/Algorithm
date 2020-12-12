n = int(input())

data = []

for i in range(n):
    data.append(list(map(int, input().split())))
    
for i in range(1, n):
    num = len(data[i])
    for j in range(num):
        if j == 0:
            data[i][j] = data[i][j] + data[i-1][0]
        elif j == (num - 1):
            data[i][j] = data[i][j] + data[i-1][-1]
        else:
            data[i][j] = max(data[i-1][j] + data[i][j], data[i-1][j-1] + data[i][j])
            
print(max(data[-1]))