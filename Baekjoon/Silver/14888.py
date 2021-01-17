N = int(input())
nums = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())

min_val, max_val = 1e9, -1e9

def dfs(i, res, add, sub, mul, div):
    global max_val, min_val
    if i == N:
        max_val = max(res, max_val)
        min_val = min(res, min_val)
        return

    else:
        if add:
            dfs(i+1, res+nums[i], add-1, sub, mul, div)
        if sub:
            dfs(i+1, res-nums[i], add, sub-1, mul, div)
        if mul:
            dfs(i+1, res*nums[i], add, sub, mul-1, div)
        if div:
            dfs(i+1, int(res/nums[i]), add, sub, mul, div-1)

dfs(1, nums[0], add, sub, mul, div)
print(max_val)
print(min_val)