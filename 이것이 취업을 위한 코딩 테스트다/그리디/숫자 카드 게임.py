N, M = map(int, input().split())	

min_val = 0	

for i in range(N):	
    lst = list(map(int, input().split()))	

    if min(lst) >=  min_val:	
        min_val = min(lst)	

print(min_val) 	