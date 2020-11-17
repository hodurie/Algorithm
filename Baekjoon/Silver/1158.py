N, K = map(int, input().split())

lst = [i for i in range(1, N + 1)]

answer = []


popNum = 0 

while len(lst) > 0:
    popNum = (popNum + (K-1)) % len(lst)
    popElemnet = lst.pop(popNum)
    answer.append(str(popElemnet))

print("<%s>" %(", ".join(answer)))
