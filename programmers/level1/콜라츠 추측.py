def solution(num):
    idx = 0
    
    while idx < 500:
        if num == 1:
            return idx
            
        if num % 2 == 0:
            num /= 2
        else:
            num *= 3
            num += 1
        
        idx += 1
        
    return -1