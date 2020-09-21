N = int(input())

lst = list(map(int, input().split()))

M = max(lst)

lst = [num/M * 100 for num in lst]
print(sum(lst)/N)

