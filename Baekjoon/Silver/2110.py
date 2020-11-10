n, c = list(map(int, input().split()))

lst = []

for i in range(n):
    lst.append(int(input()))
    
lst.sort()

start = lst[1] - lst[0]
end = lst[-1] - lst[0]
res = 0

while(start <= end):
    mid = (start + end) // 2
    value = lst[0]
    cnt = 1
    for i in range(1, len(lst)):
        if lst[i] >= value + mid :
            value = lst[i]
            cnt += 1
    if cnt >= c:
        start = mid + 1
        res = mid
    else:
        end = mid - 1
print(res)