def gcd(a, b):
    if b == 0:
        return a
        
    return gcd(b, a % b)

def solution(arr):
    res = arr[0]
    
    for num in arr[1:]:
        res = (res * num) // gcd(res, num)
    
    return res