def solution(nums):
    num = set(nums)
    print(len(num))
    
    if len(nums)/2 <= len(num):
        return len(nums)/2
    else:
        return len(num)