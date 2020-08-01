T = int(input())
for t in range(T):
    lst = [int(n) for n in input().split()]
    print(f'#{t+1} {max(lst)}')