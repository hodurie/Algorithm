N = int(input())

a, b = 0, 1

cnt = 0
while cnt != N:
    a, b = b, a + b
    cnt += 1

print(a)