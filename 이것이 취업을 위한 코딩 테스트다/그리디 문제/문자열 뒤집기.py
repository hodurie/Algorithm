s = [int(i) for i in input()]

zero = 0
one = 0

if s[0] == 0:
    zero += 1
else:
    one += 1

for i in range(1, len(s)):
    if s[i] == s[i-1]:
        pass
    else:
        if s[i] == 0:
            zero += 1
        else:
            one += 1
            
print(min(zero, one))