N = int(input())

lst = []

for i in range(N):
    lst.append(int(input()))
    
lst.sort(reverse = True)

for i in lst:
    print(i, end = " ")