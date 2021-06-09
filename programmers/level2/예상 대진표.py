from collections import deque

def solution(n,a,b):
    q = deque([i for i in range(1, n+1)])
    cnt = 1
    
    while q:
        if len(q) == n//2:
            cnt += 1
            n //= 2
            
        A, B = q.popleft(), q.popleft()
        
        if (A == a and B == b) or (A == b and B == a):
            return cnt
        elif A == a or A == b:
            q.append(A)
        elif B == a or B == b:
            q.append(B)
        else:
            q.append(A)