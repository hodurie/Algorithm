# 수정 필요
T = int(input())

for t in range(1, T+1):
    K = int(input())
    lst = [int(n) for n in input().split()]
    res = 0
    while K != 0:
        for k in range(K):
            if(lst[2*k] == lst[2*k+1]):
                lst[k] = lst[2*k]
            elif(lst[2*k] < lst[2*k+1]):
                res += lst[2*k+1] - lst[2*k] 
                lst[k] = lst[2*k+1]
            elif(lst[2*k] > lst[2*k+1]):
                res += lst[2*k] - lst[2*k+1] 
                lst[k] = lst[2*k]
        K -= 1
    print(f"#{t} {res}")
    