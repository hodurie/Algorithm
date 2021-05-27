def binary(n, num):
    arr = [0] * n
    
    for i in range(n-1, -1, -1):
        a, b = divmod(num, 2)
        arr[i] = b
        num //= 2
        
    return arr

def solution(n, arr1, arr2):
    s = ""
    answer = []
    for i in range(n):
        a, b = binary(n, arr1[i]), binary(n, arr2[i])
        s += ''.join("#" if a[j] + b[j] >= 1 else " " for j in range(n))
        answer.append(s)
        s = ''
        
    return answer