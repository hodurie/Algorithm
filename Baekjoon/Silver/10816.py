from collections import Counter

n, card1 = int(input()), list(map(int, input().split()))
m, card2 = int(input()), list(map(int, input().split()))

count = Counter(card1)

for card in card2:
    if card in count:
        print(count[card], end=' ')
    else:
        print(0, end=' ')