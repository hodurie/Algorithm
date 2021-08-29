n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))

res = []

def dfs(x):
    if len(res) == m:
        print(' '.join(map(str, res)))
        return
    
    for i in range(x, n):
        res.append(arr[i])
        dfs(i)
        res.pop()
dfs(0)