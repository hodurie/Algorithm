N = int(input())

num, cnt = 1, 1

while num + cnt <= N:
    cnt += num
    num += 1
    
gap = N - cnt

x, y = num + 1, num - gap

if num % 2 == 0:
    print('{}/{}'.format(x, y))
else:
    print('{}/{}'.format(y, x))