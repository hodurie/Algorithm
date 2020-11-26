lst = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(lst)):
    min_idx = i
    for j in range(i + 1, len(lst)):
        if lst[min_idx] > lst[j]:
            min_idx = j
    lst[i], lst[min_idx] = lst[min_idx], lst[i]

print(lst)