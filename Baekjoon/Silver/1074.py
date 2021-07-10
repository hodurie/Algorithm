def solution(n, x, y):
    global cnt, r, c
    if n == 2:
        if x == r and y == c:
            print(cnt)
            return 
        cnt += 1
        if x == r and y + 1 == c:
            print(cnt)
            return 
        cnt += 1
        if x + 1 == r and y == c:
            print(cnt)
            return 
        cnt += 1
        if x + 1 == r and y + 1 == c:
            print(cnt)
            return 
        cnt += 1
        return 
    solution(n/2, x, y)
    solution(n/2, x, y + n/2)
    solution(n/2, x + n/2, y)
    solution(n/2, x + n/2, y + n/2)
    
N, r, c = map(int, input().split())

cnt = 0

solution(2**N, 0, 0)