N = int(input())

flag = True
lst = []
def sugar(N):
    for i in range(0, (N // 3) + 1):
        for j in range(0, (N // 5) + 1):
            if (i * 3 + j * 5) == N:
                return i+j
    return -1

print(sugar(N))