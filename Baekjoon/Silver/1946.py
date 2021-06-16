import sys

for _ in range(int(input())):
    n = int(input())
    arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

    cnt = 1
    arr.sort()
    m = arr[0][1]

    for i in range(1, n):
        if m > arr[i][1]:
            m = arr[i][1]
            cnt += 1
    
    print(cnt)