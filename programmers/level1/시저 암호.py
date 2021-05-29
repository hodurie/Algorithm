def solution(s, n):
    lower = [chr(97+i) for i in range(26)]
    upper = [chr(65+i) for i in range(26)]
    
    string = ''
    
    for i in s:
        if i.isupper():
            num = ord(i) - ord('A')
            string += upper[(num + n) % 26]
        elif i.islower():
            num = ord(i) - ord('a')
            string += lower[(num + n) % 26]
        else:
            string += i

    return string