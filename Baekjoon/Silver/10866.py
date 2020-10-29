class Deque:
    def __init__(self):
        self.container = []
        self.count = 0
    
    def push_front(self, value):
        self.container.insert(0, value)
        self.count += 1
    
    def push_back(self, value):
        self.container.append(value)
        self.count += 1
    
    def pop_front(self):
        if self.empty():
            return -1
        self.count -= 1
        return self.container.pop(0)
    
    def pop_back(self):
        if self.empty():
            return -1
        self.count -= 1
        return self.container.pop()
    
    def size(self):
        return self.count
    
    def empty(self):
        if self.count == 0 :
            return 1
        return 0
    
    def front(self):
        if self.empty():
            return -1
        return self.container[0]
    
    def back(self):
        if self.empty():
            return -1
        return self.container[-1]
import sys
deque = Deque()
N = int(sys.stdin.readline())
for _ in range(N):
    c = sys.stdin.readline().split()
    if c[0] == 'push_front':
        deque.push_front(c[1])
    elif c[0] == 'push_back':
        deque.push_back(c[1])
    elif c[0] == 'pop_front':
        print(deque.pop_front())
    elif c[0] == 'pop_back':
        print(deque.pop_back())
    elif c[0] == 'size':
        print(deque.size())
    elif c[0] == 'empty':
        print(deque.empty())
    elif c[0] == 'front':
        print(deque.front())
    elif c[0] == 'back':
        print(deque.back())