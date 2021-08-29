n, m = map(int,input().split())
arr = []

def dfs(x):
    if len(arr) == m:
        print(' '.join(map(str, arr)))
        return
    
    for i in range(x, n + 1):
        arr.append(i)
        dfs(i)
        arr.pop()

dfs(1)