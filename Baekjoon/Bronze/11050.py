N, K = map(int, input().split())

v = 1

for i in range(K):
    v *= (N-i)/(i+1)
    
print(int(v))