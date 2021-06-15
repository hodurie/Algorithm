n = int(input())
rope = [int(input()) for _ in range(n)]
rope.sort()

max_value = 0
for i in range(n):
    temp = rope[i] * n
    if temp >= max_value:
        max_value = temp
    n -= 1

print(max_value)