import heapq

inf = 1e9
v, e = map(int, input().split())
start = int(input())

graph = [[] for _ in range(v + 1)]
dp = [inf] * (v + 1)

heap = []

def dijkstra(start):
    dp[start] = 0
    heapq.heappush(heap, [0, start])
    
    while heap:
        weight, now = heapq.heappop(heap)
        for n, w in graph[now]:
            
            temp = weight + w
            
            if temp < dp[n]:
                dp[n] = temp
                heapq.heappush(heap, [temp, n])
                
for i in range(e):
    u, v, w = map(int, input().split())
    graph[u].append([v, w])

dijkstra(start)

for i in dp[1:]:
    print(i if i != inf else "INF")