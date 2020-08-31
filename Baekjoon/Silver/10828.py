import sys
input = sys.stdin.readline

def push(x):
    stack.append(x)

def pop():
    if(not stack):
        return -1
    else:
        return stack.pop()
    
def size():
    return len(stack)

def empty():
    return 0 if stack else 1

def top():
    return stack[-1] if stack else -1

N = int(input())
stack = []

for _ in range(N):
    temp = input().split()

    if temp[0] == "push":
        push(temp[1])
    elif temp[0] == "pop":
        print(pop())
    elif temp[0] == "size":
        print(size())
    elif temp[0] == "empty":
        print(empty())
    elif temp[0] == "top":
        print(top())