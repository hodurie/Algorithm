n = int(input())
num_0 = [1, 0, 1]
num_1 = [0, 1, 1]

def fibo(num):
    l = len(num_0)
    if l <= num:
        for i in range(l, num + 1):
            num_0.append(num_0[i - 1] + num_0[i - 2])
            num_1.append(num_1[i - 1] + num_1[i - 2])
    print("%d %d"%(num_0[num], num_1[num]))

for i in range(n):
    fibo(int(input()))