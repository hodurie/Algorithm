def solution(lottos, win_nums):
    zero_counts = lottos.count(0)
    
    if zero_counts == 6:
        return [1, 6]
    
    nums = [n for n in lottos if n != 0]
    
    # 틀린 개수
    set_nums = list(set(nums) - set(win_nums))
    
    a = len(set_nums) + 1
    b = zero_counts + len(set_nums) + 1
    
    if a >= 6:
        a = 6
    
    if b >= 6:
        b = 6
    
    return [a, b]