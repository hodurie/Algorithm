n = int(input())
lst = []
res = []
cnt = 1
temp = False

for i in range(n):
    num = int(input())
    while cnt <= num:
        lst.append(cnt)
        res.append('+')
        cnt += 1
    if lst[-1] == num:
        lst.pop()
        res.append('-')
    else:
        temp = True
if temp:
    print('NO')
else:
    for i in res:
        print(i)
