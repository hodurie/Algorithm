N = int(input())

for i in range(1, N + 1):
    for j in range(N - i):
        print(" ", end = "")
    print("*" * ((2 * i) - 1))