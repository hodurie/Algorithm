def solution(n, results):
    INF = int(1e9)
    graph = [[INF] * (n+1) for _ in range(n+1)]

    for i in range(1, n+1):
        graph[i][i] = 0

    for a, b in results:
        graph[b][a] = 1

    for k in range(1, n+1):
        for a in range(1, n+1):
            for b in range(1, n+1):
                graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

    cnt = 0
    for a in range(1, n+1):
        res = 0
        for b in range(1, n+1):
            if graph[a][b] != INF or graph[b][a] != INF:
                res += 1
        if res == n:
            cnt += 1

    return cnt