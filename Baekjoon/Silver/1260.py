N, M, V = map(int, input().split())

mat = [[0] * (N + 1) for i in range(N + 1)]

for i in range(M):
    a, b = map(int, input().split())
    mat[a][b] = mat[b][a] = 1

lst = [0] * (N + 1)

def dfs(V):
    lst[V] = 1
    print(V, end = ' ')
    for i in range(1, N + 1):
        if(lst[i] == 0 and mat[V][i] == 1):
            dfs(i)

def bfs(V):
    queue = [V]
    lst[V] = 0
    while queue:
        V = queue.pop(0)
        print(V, end = ' ')
        for i in range(1, N + 1):
            if(lst[i] == 1 and mat[V][i] == 1):
                queue.append(i)
                lst[i] = 0

dfs(V)
print()
bfs(V)