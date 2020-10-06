N = int(input())

lst = list(map(int, input().split()))

lst.sort()

hap = []

for i in range(N):
    if i == 0:
        hap.append(lst[0])
    else:
        hap.append(hap[i-1] + lst[i])
print(sum(hap))