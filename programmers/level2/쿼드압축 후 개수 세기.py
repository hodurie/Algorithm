import re

def solution(files):
    answer = []
    s = re.compile('[^0-9]{1,}')
    n = re.compile('[0-9]{1,}')

    for idx, file in enumerate(files):
        nums = re.findall(n, file)
        strings = re.findall(s, file)
        if len(strings) == 1:
            answer.append([strings[0], nums[0], file, idx])
        else:
            s_start = file.index(strings[1])
            answer.append([strings[0], nums[0], file[s_start:], file, idx])

    answer.sort(key=lambda x: (x[0].lower(), int(x[1]), x[-1]))

    answer = [ans[-2] for ans in answer]

    return answer