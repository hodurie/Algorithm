from itertools import combinations

n, m = map(int,input().split())
arr = range(1, n + 1)

for com in combinations(arr, m):
    for c in com:
        print(c, end=' ')
    print()