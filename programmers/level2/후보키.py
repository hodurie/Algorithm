from itertools import combinations


def solution(relation):
    n_row = len(relation)
    n_col = len(relation[0])

    candidates = []
    for i in range(1, n_col + 1):
        candidates.extend(combinations(range(n_col), i))

    unique = []
    for cand in candidates:
        temp = [tuple([row[c] for c in cand]) for row in relation]
        if len(set(temp)) == n_row:
            unique.append(cand)

    res = set(unique)
    for i in range(len(unique)):
        for j in range(i + 1, len(unique)):
            if len(unique[i]) == len(set(unique[i]) & set(unique[j])):
                res.discard(unique[j])

    return len(res)