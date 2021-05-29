def solution(s):
    answer = ''
    idx = 0
    for i in s:
        if i == ' ':
            idx = 0
            answer += ' '
        elif idx % 2 == 0:
            answer += i.upper()
            idx += 1
        elif idx % 2 != 0:
            answer += i.lower()
            idx += 1
            
    return answer