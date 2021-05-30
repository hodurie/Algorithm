def solution(arr1, arr2):
    arr = [[] for i in range(len(arr1))]
    
    for i in range(len(arr1)):
        for j in range(len(arr1[i])):
            arr[i].append(arr1[i][j] + arr2[i][j])
            
            
    return arr