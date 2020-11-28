def binary_search(array, target, start, end):
    if start > end:
        return "no"
    
    mid = int(start + end) // 2
    
    if array[mid] == target:
        return "yes"
    elif array[mid] > target:
        return binary_search(array, target, start, mid - 1)
    else:
        return binary_search(array, target, mid + 1, end)
    


N = int(input())
array = list(map(int, input().split()))
array.sort()

M = int(input())
data = list(map(int, input().split()))

for value in data:
    print(binary_search(array, value, 0, N - 1), end = " ")