P, K = map(int, input().split())

n = 1
while True:
    if(P == K):
        break
    else:
        K += 1
        n += 1    
print(n)