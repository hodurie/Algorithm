import heapq
import sys

arr = []

for _ in range(int(input())):
    x = int(int(sys.stdin.readline()))
    if x == 0:
        if arr:
            v, sign = heapq.heappop(arr)
            if sign == 1:
                print(v)
            else:
                print(-v)
        else:
            print(0)
    else:
        if x < 0:
            heapq.heappush(arr, (-x, -1))
        else:
            heapq.heappush(arr, (x, 1))