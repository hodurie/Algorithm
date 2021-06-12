from itertools import permutations

def isCheck(u_id, b_id):
    for u, b in zip(u_id, b_id):
        if len(u) != len(b):
            return False
        for i in range(len(u)):
            if b[i] == '*':
                continue
            else:
                if u[i] != b[i]:
                    return False
    return True

def solution(user_id, banned_id):
    answer = []
    
    for id in permutations(user_id, len(banned_id)):
        if isCheck(id, banned_id):
            set_id = set(id)
            if set_id not in answer:
                answer.append(set_id)
            
    return len(answer)