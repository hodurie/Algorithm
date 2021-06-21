from itertools import permutations

n = int(input())

min_value = int(1e9 + 1)
max_value = -int(1e9 + 1)

arr = list(map(int, input().split()))
count = list(map(int, input().split()))
calc = ['+', '-', '*', '//']

lst = [calc[idx] for idx, c in enumerate(count) for i in range(c) if c != 0]
    
for p in set(permutations(lst, n-1)):
    p = list(p)

    v = arr[0]
    for a, b in zip(p, arr[1:]):
        if a == '//' and v < 0:
            v *= -1
            v //= b
            v *= -1
        else:
            v = eval(''.join([str(v), a, str(b)]))
    
    if v < min_value:
        min_value = v
    if v > max_value:
        max_value = v

print('%d\n%d'%(max_value, min_value))