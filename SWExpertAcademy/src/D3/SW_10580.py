# 수정 필요
T = int(input())

for t in range(1, T + 1):
    N = int(input())
    lst = []
    
    for i in range(N):
        a, b = map(int, input().split())
        lst.append(a)
        lst.append(b)
    
    cnt = 0
    for i in range(N):
        for j in range(N - 1):
            if(lst[2 * i] < lst[j + 2]):
                if(lst[2 * i + 1] > lst[j + 2]):
                   cnt += 1
            elif(lst[2 * i] > lst[j + 2]):
                if(lst[2 * i + 1] < lst[j + 2]):
                    cnt += 1
    print(f"#{t} {cnt}")
