import re

def Jaccard(str1, str2):
    union = 0
    string = set(str1+str2)
    
    for s in string:
        union += max(str1.count(s), str2.count(s))
    
    intersection = 0 
    
    for s in string:
        intersection += min(str1.count(s), str2.count(s))
    
    if union == 0:
        return 1
    
    return intersection / union
        

def solution(str1, str2):
    str1, str2 = str1.lower(), str2.lower()
    str1 = [x + y for x, y in zip(str1, str1[1:]) if len(re.findall('[a-z]', x+y)) == 2]
    str2 = [x + y for x, y in zip(str2, str2[1:]) if len(re.findall('[a-z]', x+y)) == 2]
    print(str1, str2)
    
    return int(Jaccard(str1, str2) * 65536)