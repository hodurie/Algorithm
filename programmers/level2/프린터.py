from collections import deque

def solution(priorities, location):
    q = deque([(v, idx) for idx, v in enumerate(priorities)])
    cnt = 0
    while q:
        item = q.popleft()
        
        if q and max(q)[0] > item[0]:
            q.append(item)
        else:
            cnt += 1
            if item[1] == location:
                return cnt