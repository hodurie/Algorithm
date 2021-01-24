tc = int(input())

for t in range(tc):
    N = int(input())
    arr = [1, 1, 1, 2, 2]
    
    if N > 5:
        for i in range(N - 5):
            arr.append(arr[-1] + arr[i])
        print(arr[N-1])
    else:
        print(arr[N-1])