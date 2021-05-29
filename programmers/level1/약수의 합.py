def solution(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    
    nums = set(range(1, n+1))
    print(nums)
    
    for i in range(2, n+1):
        if n % i != 0:
            nums -= {i}
            
    return sum(nums)