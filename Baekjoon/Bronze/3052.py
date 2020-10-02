lst = [0 for _ in range(42)]

for i in range(10):
    lst[int(input()) % 42] = 1

print(sum(lst))
