import sys

N = int(input())

lst = [0] * 10001

for i in range(N):
    lst[sys.stdin.readline()] += 1

for i in range(len(lst)):
    if lst[i] != 0:
        for j in range(lst[i]):
            print(i)
