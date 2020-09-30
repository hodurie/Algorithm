N = int(input())

for n in range(N):
    num, string = input().split()
    txt = ""
    for s in string:
        txt += int(num) * s
    print(txt)