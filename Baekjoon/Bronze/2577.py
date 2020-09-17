A = int(input())
B = int(input())
C = int(input())

lst = [0 for _ in range(10)]

mul = list(str(A * B * C))

for i in mul:
    lst[int(i)] += 1
    
for i in range(10):
    print(lst[i])
