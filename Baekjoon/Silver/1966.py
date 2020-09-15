tc = int(input())

for _ in range(tc):
    n, m = map(int, input().split())
    que = list(map(int, input().split()))
    check = [0 for _ in range(n)]
    check[m] = 'T'

    cnt = 0
    while True:
        if que[0] == max(que):
            cnt += 1
            if check[0] == 'T':
                print(cnt)
                break
            else:
                que.pop(0)
                check.pop(0)
        else:
            que.append(que.pop(0))
            check.append(check.pop(0))
            
        
    