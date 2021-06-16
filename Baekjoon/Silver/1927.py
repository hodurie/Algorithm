import heapq
import sys

arr = []

for _ in range(int(input())):
    x = int(int(sys.stdin.readline()))
    if x == 0:
        if arr:
            print(heapq.heappop(arr))
        else:
            print(0)
    else:
        heapq.heappush(arr, x)
