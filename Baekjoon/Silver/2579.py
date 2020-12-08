N = int(input())
stairs = [0] * 301

for i in range(N):
    stairs[i] = int(input())
    
num = [0] * 301
num[0] = stairs[0]
num[1] = num[0] + stairs[1]
num[2] = max(num[0] + stairs[2], stairs[1] + stairs[2])

for i in range(3, N):
    num[i] = max(num[i-3] + stairs[i-1], num[i-2]) + stairs[i]
    
print(num[N-1])