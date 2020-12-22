import heapq

n = int(input())

cards = []

for i in range(n):
    heapq.heappush(cards, int(input()))
    
result = 0

while len(cards) != 1:
    one = heapq.heappop(cards)
    two = heapq.heappop(cards)
    
    sum_value = one + two
    result += sum_value
    
    heapq.heappush(cards, sum_value)

print(result)