n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))

res = []

def dfs():
    if len(res) == m:
        print(' '.join(map(str, res)))
        return
    
    for i in range(n):
        if arr[i] not in res:
            res.append(arr[i])
            dfs()
            res.pop()
dfs()