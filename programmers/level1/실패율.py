def solution(N, stages):
    n = len(stages)
    fail = []
    
    for i in range(1, N+1):
        if i not in stages:
            fail.append([i, 0])            
        else:
            cnt = stages.count(i)
            fail.append([i, cnt/n])
            n -= cnt
            
                
    fail = sorted(fail, key = lambda x : x[1], reverse=True)
    return [f[0] for f in fail]  