n, x = map(int, input().split())

data = list(map(int, input().split()))

def count_num(data, x):
    length = len(data)
    
    a = first(data, x, 0, length - 1)
    
    if a == None:
        return 0
    
    b = last(data, x, 0, length - 1)

    return b - a + 1

def first(data, x, s, e):
    if s > e:
        return None
    
    mid = (s+e) // 2
    
    if (mid == 0 or x > data[mid-1]) and data[mid] == x:
        return mid
    elif data[mid] >= x:
        return first(data, x, s, mid - 1)
    else:
        return first(data, x, mid + 1, e)

def last(data, x, s, e):
    if s > e:
        return None
    
    mid = (s + e) // 2
    
    if (mid == n-1 or x < data[mid + 1]) and data[mid] == x:
        return mid
    elif data[mid] > x:
        return last(data, x, s, mid-1)
    else:
        return last(data, x, mid + 1, e)
    
cnt = count_num(data, x)

if cnt == 0:
    print(-1)
else:
    print(cnt)