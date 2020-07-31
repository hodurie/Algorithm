T = int(input())
for t in range(T):
    lst = [int(n) for n in input().split()]
    lst.remove(max(lst))
    lst.remove(min(lst))
    print(f'#{t} {round(sum(lst)/len(lst))}')