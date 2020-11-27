N = int(input())

data = []

for i in range(N):
    name, grade = input().split()
    grade = int(grade)
    data.append((name, grade))

data = sorted(data, key = lambda x : x[1])

for i in data:
    print(i[0], end = " ")