from itertools import permutations

def calculator(pattern, idx, expression):
    if idx == len(pattern)-1:
        return str(eval(expression))

    return pattern[idx].join([str(eval(calculator(pattern, idx+1, exp))) for exp in expression.split(pattern[idx])])

def solution(expression):
    patterns = list(permutations([i for i in ['-', '+', '*'] if i in expression]))
    max_value = 0

    for pattern in patterns:
        res = abs(eval(calculator(pattern, 0, expression)))
        if res > max_value:
            max_value = res

    return max_value