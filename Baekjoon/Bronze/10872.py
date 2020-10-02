def fac(N):
    temp = 1
    if N == 0 or N == 1:
        print(temp)
    else:
        for i in range(1, N + 1):
            temp *= i
        print(temp)
        
fac(int(input()))