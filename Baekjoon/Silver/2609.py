import math

a, b = map(int, input().split())
c = math.gcd(a, b)

print(c)
print((a*b)//c)