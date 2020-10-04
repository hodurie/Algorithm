N = int(input())

for i in range(N):
    print(" " * i, end = "") 
    for j in range(2*N - 1 - 2 * i ):
        print("*", end = "")
    print()

for i in range(1, N):
    print(" " * (N - 1 - i) , end = "")
    for j in range(i*2 + 1):
        print("*" , end = "")
    print()