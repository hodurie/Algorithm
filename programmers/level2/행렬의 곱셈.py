def solution(arr1, arr2):
    arr = [[] * len(arr2[0]) for i in range(len(arr1)) ]
    
    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            res = 0
            for k in range(len(arr1[0])):
                res += arr1[i][k] * arr2[k][j]
                
            arr[i].append(res)
    return arr