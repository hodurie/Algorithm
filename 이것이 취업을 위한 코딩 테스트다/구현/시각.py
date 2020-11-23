N = int(input())	

cnt = 0	

for i in range(N + 1):  	
    for j in range(60):	
        for k in range(60):	
            target = str(i).zfill(2) + str(j).zfill(2) + str(k).zfill(2)	

            if '3' in target:	
                cnt += 1	

print(cnt)