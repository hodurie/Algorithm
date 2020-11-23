loc = input()

row = int(loc[1])
col = ord(loc[0]) - ord('a') + 1

moves = [(1, 2), (1, -2), (-1, 2), (-1, -2), (2, 1), (2, -1), (-2, 1), (-2, -1)]
cnt = 0

for move in moves:
   x = row + move[0]
   y = col + move[1]
   
   if x >= 1 and x <= 8  and y >= 1 and y <= 8:
       cnt += 1
        
print(cnt)