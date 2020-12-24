n = int(input())

data = []

for i in range(n):
    a, b = map(int, input().split())
    length = b - a
    data.append((a, b, length))
    
data = sorted(data, key = lambda x : (x[1], x[0]))

count = 0
end = 0

for i in data:
    if i[0] >= end:
        count += 1
        end = i[1]

        
print(count)