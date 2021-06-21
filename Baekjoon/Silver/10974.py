from itertools import permutations

n = int(input())
arr = range(1, n+1)
for c in permutations(arr, n):
    c = list(c)
    print(' '.join(map(str, c)))