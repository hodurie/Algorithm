def solution(d, budget):
    d.sort()
    
    count = 0
    for v in d:
        if v <= budget:
            count += 1
            budget -= v
            
    return count