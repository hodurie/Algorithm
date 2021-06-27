k, n = map(int, input().split())
arr = [int(input()) for _ in range(k)]
start, end = 1, max(arr) * n

while start <= end:
    mid = (start + end) // 2
    total = 0
    for a in arr:
        total += a // mid


    print(total, mid)
    if total >= n:
        start = mid + 1
    else:
        end = mid - 1

print(end)