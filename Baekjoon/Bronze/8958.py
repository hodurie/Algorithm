N = int(input())

for i in range(N):
    string = input()
    
    cnt = 0
    seq = 0
    
    for s in string:
        if s == "O":
            seq += 1
            cnt += seq
        else:
            seq = 0
    
    print(cnt)
    