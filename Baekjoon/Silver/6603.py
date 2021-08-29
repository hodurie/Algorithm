res = []

def dfs(x):
    if len(res) == 6:
        print(' '.join(map(str, res)))
        return
    
    for i in range(x, arr[0] + 1):
        if arr[i] not in res:
            res.append(arr[i])
            dfs(i)
            res.pop()

while True:
    arr = list(map(int, input().split()))
    if arr[0] == 0:
        break
    
    dfs(1)
    print()