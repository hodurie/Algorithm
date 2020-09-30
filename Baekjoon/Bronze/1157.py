string = input().upper()

word = list(set(string))
cnt = []

for i in word:
    cnt.append(string.count(i))
    
if cnt.count(max(cnt)) >= 2:
    print('?')
else:
    print(word[cnt.index(max(cnt))])
    
