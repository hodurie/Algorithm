def solution(answers):
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    res = [[1,0], [2,0], [3,0]]
    
    for idx, i in enumerate(answers):
        if a[idx % 5] == i:
            res[0][1] += 1
        if b[idx % 8] == i:
            res[1][1] += 1
        if c[idx % 10] == i:
            res[2][1] += 1
    
    res.sort(key = lambda x : x[1], reverse=True)
            
    return [r[0] for r in res if res[0][1] == r[1]]