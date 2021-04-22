array = [0 for _ in range(91)]
n = int(input())

array[1] = 1
array[2] = 1

for i in range(3, n+1):
    array[i] = array[i-1] + array[i-2]
    
print(array[n])   