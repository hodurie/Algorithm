N = input()

lst = []

for i in N:
    lst.append(int(i))
    
lst.sort(reverse = True)

for i in lst:
    print(i, end = '')