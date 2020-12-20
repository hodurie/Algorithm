s = input()

half = len(s) // 2

left = sum([int(i) for i in s[:half]])
right = sum([int(i) for i in s[half:]])

if left == right:
    print('LUCKY')
else:
    print('READY')

