T = int(input())
for t in range(1, T+1):
    a , b, c = input().split()
    a = a[0].upper(); b = b[0].upper(); c = c[0].upper()
    str = a + b + c
    print(f"#{t} {str}")    