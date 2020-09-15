n = input()
arr = set(map(int, input().split()))
m = input()
lst = list(map(int, input().split()))

for i in lst:
    if i in arr:
        print('1')
    else:
        print('0')