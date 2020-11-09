N = int(input())

books = {}
for i in range(N):
    book = input()
    
    if book not in books:
        books[book] = 1
    else:
        books[book] += 1

val = max(books.values())
lst = []

for key, value in books.items():
    if value == val:
        lst.append(key)
        
print(sorted(lst)[0])
