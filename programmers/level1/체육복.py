def solution(n, lost, reserve):

    s_lost = set(lost) - set(reserve)
    s_reserve = set(reserve) - set(lost)
    
    for i in s_reserve:
        if i -1 in s_lost:
            s_lost.remove(i-1)
        elif i + 1 in s_lost: 
            s_lost.remove(i+1)
    
    print(s_reserve, s_lost)
    n -= len(s_lost)
    return n