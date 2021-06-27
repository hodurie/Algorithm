import sys

input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))

start, end, res = 0, max(arr), 0

while start <= end:
    mid = (start + end) // 2
    total = 0
    
    for a in arr:
        if a > mid:
            total += a - mid
        
    if total >= m:
        res = mid
        start = mid + 1
    else:
        end = mid - 1

print(res)