from collections import defaultdict, deque

def solution(n, edge):
    check = [-1] * (n+1)
    check[1] = 0 
    graph = defaultdict(lambda : [])
    for a, b in edge:
        graph[a].append(b)
        graph[b].append(a)
        
    q = deque()
    q.append(1)
    
    while q:
        v = q.popleft()
        
        for i in graph[v]:
            if check[i] == -1:
                check[i] = check[v] + 1
                q.append(i)
                
    max_value = max(check)
    cnt = 0
    for i in range(1, n+1):
        if check[i] == max_value:
            cnt += 1
            
    return cnt
        
        
        
        
        