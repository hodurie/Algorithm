T = int(input())

for t in range(1, T+1) :
    N = int(input())
    days = list(map(int, input().split()))
    ans = 0
    max = 0
    for i in range(N-1, -1, -1) :
        if days[i] > max :
            max = days[i]
        ans += max - days[i]

    print("#{} {}".format(t, ans))