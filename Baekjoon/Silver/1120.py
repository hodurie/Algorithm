A, B = input().split()

answer = int(1e9)

for i in range(len(B) - len(A) + 1):
    cnt = 0
    for j in range(len(A)):
        if A[j] != B[i + j]:
            cnt += 1
    
    if answer >= cnt:
        answer = cnt

print(answer)