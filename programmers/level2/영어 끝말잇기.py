def solution(n, words):
    answer = [words[0]]
    idx = 0
    
    for i in range(1, len(words)):
        if words[i] not in answer:
            if words[i][0] != words[i-1][-1]:
                idx = i
                break
            else:
                answer.append(words[i])
        else:
            idx = i
            break
    
    if idx == 0:
        return [0, 0]
    else:
        return [idx % n + 1, idx // n + 1]