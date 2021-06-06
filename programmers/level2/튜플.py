def solution(s):
    s = s[2:-2].split('},{')
    s = [list(map(int, i.split(','))) if ',' in i else [int(i)] for i in s]
    s.sort(key=lambda x : len(x))
    answer = []
    
    for i in s:
        if len(i) == 1:
            answer.extend(i)
        else:
            for j in i:
                if j not in answer:
                    answer.append(j)
    return answer