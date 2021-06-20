def solution(rows, columns, queries):
    answer = []
    MAP = [[0] * (columns+1) for _ in range(rows+1)]

    cnt = 1
    for x in range(1, rows+1):
        for y in range(1, columns+1):
            MAP[x][y] = cnt
            cnt += 1

    for x1, y1, x2, y2 in queries:
        m = 10001
        temp = MAP[x1][y1]
        m = min(m, temp)

        for y in range(y1+1, y2+1):
            t = MAP[x1][y]
            MAP[x1][y] = temp
            temp = t
            m = min(m, temp)

        for x in range(x1+1, x2+1):
            t = MAP[x][y2]
            MAP[x][y2] = temp
            temp = t
            m = min(temp, m)

        for y in range(y2-1, y1-1, -1):
            t = MAP[x2][y]
            MAP[x2][y] = temp
            temp = t
            m = min(temp, m)

        for x in range(x2-1, x1-1, -1):
            t = MAP[x][y1]
            MAP[x][y1] = temp
            temp = t
            m = min(temp, m)

        answer.append(m)

    return answer