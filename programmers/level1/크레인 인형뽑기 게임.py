def solution(board, moves):
    res = []
    cnt = 0
    n = len(board)
    
    for move in moves:
        for i in range(n):
            if board[i][move-1] != 0:
                if not res:
                    res.append(board[i][move-1])
                elif res[-1] == board[i][move-1]:
                    res.pop()
                    cnt += 2
                else:
                    res.append(board[i][move-1])
                board[i][move-1] = 0
                break

    return cnt