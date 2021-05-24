def is_even(num):
    v = 1
    if num == 1:
        return -1
    
    for i in range(2, num + 1):
        if num % i == 0:
            v += 1
    if v % 2 == 0:
        return num
    
    return -num

def solution(left, right):
    return sum([is_even(i) for i in range(left, right+1)])