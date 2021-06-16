n = int(input())

card = list(map(int, input().split()))
gold = 0

m = max(card)
idx = card.index(m)

for i in range(idx-1, -1, -1):
    gold += m + card[i]

for i in range(idx + 1, n):
    gold += m + card[i]

print(gold)