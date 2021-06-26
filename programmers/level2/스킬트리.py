def solution(skill, skill_trees):
    answer = 0

    for tree in skill_trees:
        learned = ""
        for t in tree:
            if t in skill:
                learned += t
        if learned == skill[:len(learned)]:
            answer += 1

    return answer