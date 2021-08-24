from itertools import combinations

n, s = map(int, input().split())
arr = list(map(int, input().split()))
idx = 0

for i in range(len(arr)):
    if arr[i] >= 0:
        idx = i
lst = []

for i in range(1, n+1):
    for p in combinations(arr, i):
        if s == sum(p):
            lst.append(p)

print(len(lst))