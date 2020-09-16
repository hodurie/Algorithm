tc = int(input())

for _ in range(tc):
    F = int(input())
    lst = []
    for _ in range(F):
        a, b = list(input().split())
        lst.append(a)
        lst.append(b)

        friends = set(lst)
        print(len(friends))