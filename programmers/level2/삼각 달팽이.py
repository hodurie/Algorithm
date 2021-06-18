def solution(n):
    arr = [[0] * i for i in range(1, n+1)]
    x, y = -1, 0

    cnt = 1
    for i in range(n):
        for j in range(n-i):
            if i % 3 == 0:
                x += 1
            elif i % 3 == 1:
                y += 1
            else:
                x -= 1
                y -= 1

            arr[x][y] = cnt
            cnt += 1

    answer = []
    for a in arr:
        answer.extend(a)

    return answer
