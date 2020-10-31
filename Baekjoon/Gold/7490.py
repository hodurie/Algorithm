import copy

def recursive(arr, n):
    if len(arr) == n:
        lst.append(copy.deepcopy(arr))
        return
    arr.append(' ')
    recursive(arr, n)
    arr.pop()
    
    arr.append('+')
    recursive(arr, n)
    arr.pop()
    
    arr.append('-')
    recursive(arr, n)
    arr.pop()

tc = int(input())

for _ in range(tc):
    lst = []
    n = int(input())
    recursive([], n - 1)
    
    m = [i for i in range(1, n + 1)]
    
    for i in lst:
        string = ""
        for j in range(n - 1):
            string += str(m[j]) + i[j]
        string += str(m[-1])
        if eval(string.replace(" ", "")) == 0:
            print(string)
    print()
    