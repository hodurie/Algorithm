N = int(input())

cnt = 0

for n in range(N):
    string = input()
    temp = sorted(string, key = string.find)
    string = list(string)
    
    if string == temp:
        cnt += 1
print(cnt)
    