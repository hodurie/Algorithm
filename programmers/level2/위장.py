
def solution(clothes):
    names = list(set([b for a, b in clothes]))
    d = {name:1 for name in names}
    
    if len(names) == 1:
        return len(clothes)
    
    for a, b in clothes:
        d[b] += 1
    
    nums = [d[name] for name in names]
    n = 1
    for num in nums:
        n *= num
    return n - 1