arr = 0
min_value = 101

for _ in range(7):
    v = int(input())
    if v % 2 != 0:
        arr += v
        if v < min_value:
            min_value = v
if arr == 0:
    arr = -1
    print(arr)
else:
    print(arr)
    print(min_value)