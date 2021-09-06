from collections import deque

n, k = map(int, input().split())
arr = list(range(1, n + 1))
result = []
cnt = 0

q = deque(arr)

while q:
    cnt += 1
    v = q.popleft()
    if cnt == k:
        result.append(v)
        cnt = 0
    else:
        q.append(v)

print(f'<{str(result)[1:-1]}>')