def check_team(teams, x):
    if teams[x] != x:
        teams[x] = check_team(teams, teams[x])
    return teams[x]
   

def union_team(teams, a, b):
    a = check_team(teams, a)
    b = check_team(teams, b)
    
    if a < b:
        teams[b] = a
    else:
        teams[a] = b
        
v, e = map(int, input().split())

teams = [0] * (v+1)

for i in range(1, v+1):
    teams[i] = i

for i in range(e):
    num, a, b = map(int, input().split())
    
    if num == 0:
        union_team(teams, a, b)
    else:
        if check_team(teams, a) == check_team(teams, b):
            print('YES')
        else:
            print('NO')
