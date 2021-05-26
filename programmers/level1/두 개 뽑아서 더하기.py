def solution(numbers):
    num = set()
    n = len(numbers)
    for i in range(n):
        for j in range(i+1, n):
            num.add(numbers[i] + numbers[j])
    num = sorted(list(num))

    return num