tc = input()

lst = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for i in lst:
    tc = tc.replace(i, " ")
    
print(len(tc))
