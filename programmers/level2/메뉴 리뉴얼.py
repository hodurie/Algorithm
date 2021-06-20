from itertools import combinations
from collections import Counter

def solution(orders, course):
    res = []
    
    for n in course:
        temp = []
        for order in orders:
            if len(order) >= n:
                c = combinations(sorted(order), n)
                c = [i for i in c]
                temp += c
        counter = Counter(temp)
        if counter:
            if max(counter.values()) != 1:
                res += [''.join(list(k)) for k, v in counter.items() if v == max(counter.values())]
                
    return sorted(res)