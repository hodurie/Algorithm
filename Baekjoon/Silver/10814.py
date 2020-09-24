N = int(input())

names = list()
idx = list()
for n in range(N):
    A, B = input().split()
    idx.append((n, int(A)))
    names.append(B)
idx = sorted(idx, key = lambda x : x[1])

for i in idx:
    print(i[1], names[i[0]])
