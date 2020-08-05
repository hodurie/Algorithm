T = input()

for t in range(1, T + 1):
    N, M = map(int, input().split())
    lst = list(map(int, input().split()))
    res = []

    for i in range(N - 1):
        for j in range(i + 1, N):
            sum = lst[i] + lst[j]
            if(sum == M):
                res.append(sum)
                break
            elif(sum < M):
                res.append(sum)
                
    
    if(len(res) == 0):
        print("#{} {}".format(t, -1))
    else:
        print("#{} {}".format(t, max(res)))