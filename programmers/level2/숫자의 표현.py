def solution(n):
    answer = 1
    
    for i in range(n):
        cnt = 0
        for j in range(i + 1, n):
            cnt += j
            if cnt == n:
                answer += 1
                break
            elif cnt > n:
                break
            
    return answer