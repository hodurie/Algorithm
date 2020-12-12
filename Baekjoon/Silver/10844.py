n = int(input())

data = [[0 for i in range(10)] for j in range(101)]

for i in range(1, 10):
    data[1][i] = 1
    
for i in range(2, n + 1):
    for j in range(10):
        if j == 0:
            data[i][j] = data[i - 1][1]
        elif j == 9:
            data[i][j] = data[i - 1][8]
        else:
            data[i][j] = data[i - 1][j - 1] + data[i - 1][j + 1]
    
print(sum(data[n]) % 1000000000)