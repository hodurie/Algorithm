n = int(input())

array = list(map(int, input().split()))
unique_value = sorted(list(set(array)))

dict_data = {}

for idx, i in enumerate(unique_value):
    dict_data[i] = idx

for i in array:
    print(dict_data[i], end = ' ')