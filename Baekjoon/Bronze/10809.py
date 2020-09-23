S = input()

lst = list(map(chr, range(97, 123)))

for i in lst:
    print(S.find(i), end = " ")