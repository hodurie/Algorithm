n = int(input())

data = list(map(int, input().split()))

hap = [data[0]]

for i in range(n-1):
    hap.append(max(hap[i] + data[i + 1], data[i + 1]))

print(max(hap))