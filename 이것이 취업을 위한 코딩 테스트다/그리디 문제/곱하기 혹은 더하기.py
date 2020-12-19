s = [int(i) for i in input()]

result = s[0]

for i in range(1, len(s)):
    if s[i] == 0 or result <= 1:
        result += s[i]
    else:
        result *= s[i]

print(result)