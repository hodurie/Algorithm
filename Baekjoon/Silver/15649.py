from itertools import permutations
n, m = map(int, input().split())
arr = list(range(1, n+1))

for per in permutations(arr, m):
    for p in per:
        print(p, end=' ')
    print()