from bisect import bisect_left
from itertools import combinations

def make_all_cases(item):
    cases = []
    for k in range(5):
        for combi in combinations([0,1,2,3], k):
            case = ""
            for idx in range(4):
                if idx not in combi:
                    case += item[idx]
                else:
                    case += '-'
            cases.append(case)
    return cases

def solution(info, query):
    info = [i.split() for i in info]
    query = [q.replace(' and', '').split() for q in query]
    res = []
    db = {}
    
    for item in info:
        cases = make_all_cases(item)
        for case in cases:
            if case not in db.keys():
                db[case] = [int(item[4])]
            else:
                db[case].append(int(item[4]))
    
    for value in db.values():
        value.sort()
        
    for item in query:
        target = ''
        
        for i in item[:4]:
            target += i

        if target in db.keys():
            res.append(len(db[target]) - bisect_left(db[target], int(item[4]), lo=0, hi=len(db[target])))
        else:
            res.append(0)
            
    return res