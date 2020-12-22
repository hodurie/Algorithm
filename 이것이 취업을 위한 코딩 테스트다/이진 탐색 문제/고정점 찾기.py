n = int(input())

data = list(map(int, input().split()))

def binary_search(data, s, e):
    if s > e:
        return None
    
    mid = (s+e)//2
    
    if data[mid] == mid:
        return mid
    elif data[mid] > mid:
        return binary_search(data, s, mid -1)
    else:
        return binary_search(data, mid + 1, e)
    
idx = binary_search(data, 0, n-1)

if idx == None:
    print(-1)
else:
    print(idx)   
    