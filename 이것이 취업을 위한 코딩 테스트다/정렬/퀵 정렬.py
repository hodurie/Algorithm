lst = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]

def quick_sort(lst):
    if len(lst) <= 1:
        return lst
    
    pivot = lst[0]
    tail = lst[1:]
    
    left_side = [x for x in tail if x <= pivot]
    right_side = [x for x in tail if x > pivot]
    
    return quick_sort(left_side) + [pivot] + quick_sort(right_side)

print(quick_sort(lst))