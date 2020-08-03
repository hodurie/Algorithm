md = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
T = int(input())
for t in range(T):
    str = input()
    month = int(str[4:6])
    day = int(str[6:8])
    res = "-1"
    
    if 1 <= month and month <= 12 and 1 <= day and day <= md[month-1]:
        res = str[0:4]+"/"+str[4:6]+"/"+str[6:8]
    print(f"#{t+1} {res}")