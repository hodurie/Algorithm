from collections import deque


def solution(n, computers):
    visited = [0] * n
    graph = {i: [] for i in range(n)}

    for idx, arr in enumerate(computers):
        for index, v in enumerate(arr):
            if v == 1:
                graph[idx].append(index)

    def bfs(v):
        q = deque()
        q.append(v)

        while q:
            v = q.popleft()

            for g in graph[v]:
                if visited[g] == 0:
                    visited[g] = 1
                    q.append(g)

    cnt = 0
    for i in range(n):
        if visited[i] == 0:
            bfs(i)
            cnt += 1

    return cnt
