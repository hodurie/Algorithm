def solution(arr):
    arr = arr[::-1]
    answer = [arr[-1]]
    
    while arr:
        a = arr.pop()
        if answer[-1] != a:
            answer.append(a)
        
    return answer