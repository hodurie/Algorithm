def count(trophies):
    max_val = trophies[0]
    cnt = 1
    for trophy in trophies:
        if trophy > max_val:
            cnt +=1
        max_val = max(max_val, trophy)
    return cnt

N = int(input())
trophies = []

for _ in range(N):
    trophies.append(int(input()))

print(count(trophies))
trophies.reverse()
print(count(trophies))