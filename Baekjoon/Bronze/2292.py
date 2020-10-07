N = int(input())

cnt = 1
hap = 1
while hap < N:
    hap += 6 * cnt
    cnt += 1
    
print(cnt)