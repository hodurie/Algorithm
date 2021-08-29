n = int(input())
res = 0

def is_available(x):
    for i in range(x):
        if row[x] == row[i]:
            return False

        if abs(row[x] - row[i]) == x - i:
            return False
    return True

def dfs(x):
    global res
    if x == n:
        res += 1
        return 

    for i in range(n):
        row[x] = i
        if is_available(x):
            dfs(x+1)

row = [0] * n

dfs(0)
print(res)