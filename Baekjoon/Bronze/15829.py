n = int(input())
string = input()
hap = 0
for i in range(n):
    temp = int(ord(string[i])) - 96
    hap += (int(ord(string[i])) - 96) * 31 ** i
print(hap % 1234567891)