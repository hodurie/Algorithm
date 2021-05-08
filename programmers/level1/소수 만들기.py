def solution(nums):
    from itertools import combinations
    value = combinations(nums, 3)
    
    count = 0
    for i in value:
        sum_value = sum(i)
        for j in range(2, sum_value):
            if sum_value % j == 0:
                break
        else:
            count += 1
            
    return count