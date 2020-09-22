string = list(input().split())

cnt = 0
for i in string:
    if i == '':
        pass
    else:
        cnt += 1
        
print(cnt)