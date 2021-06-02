from itertools import permutations

def prime_number(n):
    if n == 1 or n == 0:
        return False
    if n == 2:
        return True
    
    for i in range(2, int(n//2) + 1):
        if n % i == 0:
            return False
    return True

def solution(numbers):
    nums = []
    for i in range(len(numbers)):
        for j in list(permutations(numbers, i + 1)):
            nums.append(int(''.join(j)))
    nums = list(set(nums))

    return sum([1 for num in nums if prime_number(num)])