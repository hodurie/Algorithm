n = int(input())

lst = []

for i in range(n):
    word = input()
    lst.append((word, len(word)))

lst = list(set(lst))
    
lst.sort(key = lambda x : (x[1], x[0]))

for i in range(len(lst)):
    print(lst[i][0])