tc = int(input())

for _ in range(tc):
    a, b = map(int, input().split())
    
    res = [(a ** i) % 10 for i in range(1, 5)][(b % 4) -1]
    
    if res != 0:
        print(res)
    else:
        print(10)