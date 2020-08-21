def hap(r, c):
    sum = 0
    for i in range(r, r+M):
        for j in range(c, c+M):
            sum += arr[i][j]
    return sum

T = int(input())

for t in range(1, T+1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for i in range(N)]
    
    res = 0
    for i in range(N - M + 1):
        for j in (N - M + 1):
            temp = hap(i, j)
            if res < temp:
                res = temp
    print(f"#{t} {res}")