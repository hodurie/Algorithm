def solution(arr):
    a = min(arr)
    
    del arr[arr.index(a)]
    
    if len(arr) == 0:
        return [-1]
    elif len(arr) == 1 and arr[0] == 10:
        return [-1]
    else:
        return arr