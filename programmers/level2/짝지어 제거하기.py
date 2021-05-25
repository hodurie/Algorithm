def solution(s):
    new = []
    for i in s:
        if len(new) == 0:
            new.append(i)
        elif new[-1] == i:
            new.pop()
        else:
            new += i

    if len(new) == 0:
        return 1
    else:
        return 0
