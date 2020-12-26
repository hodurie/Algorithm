from collections import deque

def bfs(x):
    count = 0
    q = deque()
    q.append((x, count))
    
    while q:
        now, count = q.popleft()
        
        if visited[now] == False:
            if now == k:
                return count
            
            visited[now] = True
            count += 1
    
            if (now * 2) <= 1000000:
                q.append((now*2, count))
            if (now + 1) <= 1000000:
                q.append((now+1, count))
            if (now - 1) >= 0:
                q.append((now-1, count))

n, k = map(int, input().split())

visited = [False] * (1000001)

print(bfs(n))