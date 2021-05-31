from collections import deque

def bfs(start, numbers, target):
    q = deque([start])
    cnt = 0
    
    while q:
        value, idx = q.popleft()
        
        if idx == len(numbers):
            if value == target:
                cnt += 1
        else:
            q.append([value + numbers[idx], idx + 1])
            q.append([value - numbers[idx], idx + 1])
        
    return cnt
    

def solution(numbers, target):
    answer = 0
    answer += bfs([0, 0], numbers, target)
    return answer