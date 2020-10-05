A, B, C = map(int, input().split())
p = 0

if(C <= B):
    p = -1
else:
    p = int(A // (C - B)) + 1 
print(p)