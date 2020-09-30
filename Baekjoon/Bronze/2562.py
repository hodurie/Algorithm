lst = []
for i in range(1, 10):
    n = int(input())
    lst.append((i, n))

lst.sort(key = lambda x : x[1], reverse = True)
print(lst[0][1])
print(lst[0][0])