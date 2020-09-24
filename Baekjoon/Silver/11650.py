N = int(input())

coord = list()
for n in range(N):
    x, y = map(int, input().split())
    coord.append((x, y))

coord = sorted(coord)
for i in coord:
    print(i[0], i[1])