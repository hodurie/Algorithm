lst = [0, 1, 2, 4]

for i in range(len(lst), 11):
    lst.append(lst[i - 3] + lst[i - 2] + lst[i - 1])

N = int(input())

for i in range(N):
    num = int(input())
    print(lst[num])