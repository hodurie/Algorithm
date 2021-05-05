N, M = map(int, input().split())
A, B = input().split()

alp = [3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1]

string = ""
min_len = min(N, M)

for i in range(min_len):
    string += A[i] + B[i]
    
string += A[min_len:] + B[min_len:]

lst = [alp[ord(s) - ord('A')] for s in string]

for i in range(N + M - 2):
    for j in range(N + M - 1 - i):
        lst[j] += lst[j+1]
        
print("{}%".format(lst[0] % 10 * 10 + lst[1] % 10))