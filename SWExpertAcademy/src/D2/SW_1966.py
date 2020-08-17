T = int(input())

for t in range(1, T+1):
    N = int(input())
    lst = [int(n) for n in input().split()]
    lst = sorted(lst)
    print(f"#{t} ", end = "")
    for n in range(N):
        print(lst[n], end = " ")
    print()