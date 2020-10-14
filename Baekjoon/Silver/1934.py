import math

n = int(input())

for i in range(n):
    a, b = map(int, input().split())
    c = math.gcd(a, b)

    print((a*b)//c)