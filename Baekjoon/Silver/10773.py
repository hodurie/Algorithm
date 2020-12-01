N = int(input())

data = []

for i in range(N):
    number = int(input())
    
    if number == 0:
        data.pop()
    else:
        data.append(number)
        
print(sum(data))