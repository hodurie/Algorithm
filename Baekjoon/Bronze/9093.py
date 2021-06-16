from collections import deque

for _ in range(int(input())):
    arr = list(input().split())

    q = deque(arr)

    while q:
        s = q.popleft()
        print(s[::-1], end =' ')
    print()