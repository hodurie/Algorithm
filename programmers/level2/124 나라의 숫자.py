def solution(n):
    num = ['1', '2', '4']
    string = ""
    
    a, b = divmod(n-1, 3)

    if a == 0:
        return num[b]
    else:
        string += num[b]
        while True:
            a, b = divmod(a-1, 3)
            string += num[b]
            if a == 0:
                break
                
    string = string[::-1]
    
    return string