n, m = map(int, input().split())

arr = [list(input()) for _ in range(n)]
res = []

max_value = 64

for x in range(0, n - 7):
    for y in range(0, m - 7):
        cnt = 0
        for i in range(x, x + 8):
            for j in range(y, y + 8):
                if (x + y) % 2 == 0:
                    if (i + j) % 2 == 0:
                        if arr[i][j] != arr[x][y]:
                            cnt += 1
                    elif arr[i][j] == arr[x][y]:
                            cnt += 1
                elif (x + y) % 2 != 0:
                    if (i + j) % 2 != 0:
                        if arr[i][j] != arr[x][y]:
                            cnt += 1
                    elif arr[i][j] == arr[x][y]:
                        cnt += 1
        cnt = min(cnt, 64 - cnt)
        if cnt < max_value:
            max_value = cnt

print(max_value)