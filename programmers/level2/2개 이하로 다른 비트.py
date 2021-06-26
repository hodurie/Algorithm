def solution(numbers):
    res = []

    for number in numbers:
        if number % 2 == 0:
            res.append(number + 1)
        else:
            bit = '0' + bin(number)[2:]
            idx = bit.rfind('0')
            bit = bit[:idx] + '10' + bit[idx + 2:]
            res.append(int(bit, 2))
    return res