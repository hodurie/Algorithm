from collections import deque

s = input()
n = int(input())

lt = deque(s)
rt = deque()

def makeString(cmd):
    if cmd[0] == 'L':
        if len(lt) != 0:
            v = lt.pop()
            rt.appendleft(v)
    elif cmd[0] == 'D':
        if len(rt) != 0:
            v = rt.popleft()
            lt.append(v)
    elif cmd[0] == 'B':
        if len(lt) != 0:
            lt.pop()
    else:
        lt.append(cmd[1])

for _ in range(n):
    cmd = list(input().split())
    makeString(cmd)

res = list(lt + rt)
print(''.join(res))