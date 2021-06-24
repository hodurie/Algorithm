def solution(N, number):
    answer = -1
    dp = []

    for i in range(1, 9):
        cases = set()
        check_number = int(str(N) * i)
        cases.add(check_number)

        for j in range(i-1):
            for op1 in dp[j]:
                for op2 in dp[-j-1]:
                    cases.add(op1 - op2)
                    cases.add(op1 + op2)
                    cases.add(op1 * op2)
                if op2 != 0:
                    cases.add(op1 // op2)

        if number in cases:
            return i

        dp.append(cases)

    return -1