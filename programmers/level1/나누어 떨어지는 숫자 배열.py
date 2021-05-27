def solution(arr, divisor):
    arr = [a for a in arr if a % divisor == 0 ]
    
    if arr:
        return sorted(arr)
    else:
        return [-1] 