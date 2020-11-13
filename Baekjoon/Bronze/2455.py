max_val = 0
hap = 0

for i in range(4):
    A, B = map(int, input().split())
    
    hap -= A
    
    if hap >= max_val:
        max_val = hap
        
    hap += B
    
    if hap >= max_val:
        max_val = hap
        
print(max_val)