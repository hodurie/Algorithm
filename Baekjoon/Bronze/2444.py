n = int(input())

for i in range(1, n + 1):
    print(" " * (n - i), end = "")
    print("*" *((2 * i) - 1))

for i in range(1, n):
    print(" " * i, end = "")
    print("*" * ((n - i - 1) * 2 + 1))
    