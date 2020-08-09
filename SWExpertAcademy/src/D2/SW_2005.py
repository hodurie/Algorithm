T = int(input())

for t in range(1, T + 1):
    n = int(input())
    arr = [[1]] 
    for i in range(1, n):
        arr.append([])
        arr[i].append(1)
        for c in range(len(arr[i-1])-1):
            arr[i].append(arr[i-1][c]+arr[i-1][c+1])
        arr[i].append(1)
    print('#%d'%(t))
    for e in arr:
        print(' '.join(map(str,e)))