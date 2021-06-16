for _ in range(int(input())):
    n = bin(int(input()))
    n = n[2:][::-1]
    for i in range(len(n)):
        if n[i] == '1':
            print(i, end = ' ')