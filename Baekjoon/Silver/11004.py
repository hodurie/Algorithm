n, k = map(int, input().split())
lst = list(map(int, input().split()))

lst = sorted(lst)
print(lst[k - 1])