n = int(input())

for _ in range(n):
    x, y = map(int, input().split())
    dist = y - x
    
    count = 1
    number = 2
    
    while number < dist:
        count += 1
        number += count * 2
    
    diff = number - dist
    
    if diff >= count:
        print(count * 2 -1)
    else:
        print(count * 2)