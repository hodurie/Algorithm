m = int(input())
n = int(input())

val = []

for i in range(m, n + 1):
    if i != 0:
        flag = True
    for j in range(2, i):
        if m % j == 0:
            flag = False
            break
    if not flag:
        val.append(i)

if len(val) == 0:
    print(-1)
else:
    print(sum(val))
    print(val[0])