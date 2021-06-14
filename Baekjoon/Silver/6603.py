from itertools import combinations

while True:
    arr = list(map(int, input().split()))
    if arr[0] == 0:
        break
    
    for com in combinations(arr[1:], 6):
        print(' '.join(map(str, com)))
    print()