from collections import deque

n, m, k = map(int, input().split())

arr = list(range(1, n+1))

def check():
    q = deque(arr)
    cnt = 0

    while q:
        num = len(q) // 2
        div = 0 if len(q) % 2 == 0 else 1
        cnt += 1
        for _ in range(num):
            a, b = q.popleft(), q.popleft()
            if (a == m and b == k) or (a == k and b == m):
                return cnt
            elif a == m or a == k:
                q.append(a)
            elif b == m or b == k:
                q.append(b)
            else:
                q.append(a)

        if len(q) != 1 and div == 1:
            a = q.popleft()
            q.append(a)
        elif len(q) == 1 and div == 1:
            return -1

print(check())