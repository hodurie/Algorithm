hap = 0

for i in range(5):
    num = int(input())
    if num <= 40:
        hap += 40
    else:
        hap += num

print(int(hap/5))