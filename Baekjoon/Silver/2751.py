N = int(input())

lst = []

for _ in range(N):
    lst.append(int(input()))

lst.sort(reverse = False)

for i in lst:
    print(i)