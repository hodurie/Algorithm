A, B = map(str, input().split(' '))

min_val = 101
for i in range(0, len(B) - len(A) + 1):
    cnt = 0
    for j in range(0, len(A)):
        if A[j] != B[j+i]:
            cnt += 1
    min_val = min(min_val, cnt)
print(min_val)