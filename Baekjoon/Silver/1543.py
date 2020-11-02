words = input()
word = input()

cnt = 0
idx = 0

while len(words) - idx >= len(word):
    if words[idx:idx + len(word)] == word:
        cnt += 1
        idx += len(word)
    else:
        idx += 1
        
print(cnt)