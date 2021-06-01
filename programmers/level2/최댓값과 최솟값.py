def solution(s):
    max_value = max([int(i) for i in s.split()])
    min_value = min([int(i) for i in s.split()])
    return str(min_value) + ' ' + str(max_value)