array = [] 

for i in range(int(input())):
    [a, b] = map(int, input().split())
    arr = [b, a] 
    array.append(arr) 

array = sorted(array) 

for arr in array: 
    print(arr[1], arr[0])