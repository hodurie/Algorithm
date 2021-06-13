from collections import deque

def solution(prices):
    answer = []
    q = deque(prices)
    
    while q:
        price = q.popleft()
        cnt = 0
        for i in q:
            if price <= i:
                cnt += 1
            else:
                cnt += 1
                break
        answer.append(cnt)
        
    return answer