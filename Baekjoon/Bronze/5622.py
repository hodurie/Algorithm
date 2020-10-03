words = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

string = input()
cnt = 0
for i in range(len(string)):
    for idx, j in enumerate(words):
        if string[i] in j:
            cnt += idx + 3
print(cnt)