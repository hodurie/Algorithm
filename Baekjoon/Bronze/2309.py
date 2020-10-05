h = []

for i in range(9):
    h.append(int(input()))

res = sum(h)
   
for i in range(8):
    for j in range(i + 1, 9):
        if (res - h[i] - h[j]) == 100:
            tmp1 = h[i]
            tmp2 = h[j]

h.remove(tmp1)
h.remove(tmp2)
h.sort()
            
for i in  h:
    print(i)