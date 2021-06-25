from collections import deque

def check(begin, words):
    res = []

    for word in words:
        diff = 0
        for a, b in zip(begin, word):
            if a != b:
                diff += 1
        if diff == 1:
            res.append(word)

    return res

def solution(begin, target, words):
    if target not in words:
        return 0

    visited = [begin]
    q = deque()
    q.append((begin, 0))

    while q:
        begin, cnt = q.popleft()

        if begin == target:
            return cnt

        for word in check(begin, words):
            if word not in visited:
                visited.append(word)
                q.append((word, cnt + 1))

    return 0