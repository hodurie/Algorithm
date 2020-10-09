n = int(input())

a = list(map(int, input().split()))

b, c = map(int, input().split())

res = 0

for num in a:
    num = num - b
    res += 1

    if num > 0:
        res += res // c

        if num % c > 0:
            res += 1


print(res)