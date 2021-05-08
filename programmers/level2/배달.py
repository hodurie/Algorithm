import heapq

def solution(N, road, K):
    def dijkstra():
        q = []
        heapq.heappush(q, (0, 1))
        distance[1] = 0
        
        while q:
            dist, now = heapq.heappop(q)
            if distance[now] < dist:
                continue

            for i in graph[now]:
                cost = dist + i[1]
                if cost < distance[i[0]] and cost <= K:
                    distance[i[0]] = cost
                    heapq.heappush(q, (cost, i[0]))
                    
    graph = [[] for i in range(N+1)]
    distance = [float('inf')] * (N + 1)
    
    for a, b, c in road:
        graph[a].append((b, c))
        graph[b].append((a, c))
        
    dijkstra()
    
    count = 0
    for i in range(1, N+1):
        if distance[i] != float('inf'):
            count += 1
    
    return count