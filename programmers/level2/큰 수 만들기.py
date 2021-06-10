def solution(number, k):
    res = [number[0]]
    
    for num in number[1:]:
        while len(res) > 0 and k > 0 and num > res[-1]:
            res.pop()
            k -= 1
        res.append(num)
    
    if k != 0:
        res = res[:-k]      
        
    return ''.join(res)