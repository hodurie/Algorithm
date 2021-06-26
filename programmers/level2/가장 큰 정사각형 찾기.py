def solution(board):
    n, m = len(board), len(board[0])
    res = 0

    for x in range(1, n):
        for y in range(1, m):
            if board[x][y] == 1:
                board[x][y] += min(board[x-1][y-1], board[x-1]
                                  [y], board[x][y-1])

    for i in range(n):
        if res < max(board[i]):
            res = max(board[i])

    return res ** 2