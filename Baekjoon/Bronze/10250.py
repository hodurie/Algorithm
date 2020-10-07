tc = int(input())

for _ in range(tc):
    H, W, N = map(int, input().split())
    d = N // H + 1
    f = N % H
    if f == 0:
        d -= 1
        f = H
    print(f * 100 + d)
