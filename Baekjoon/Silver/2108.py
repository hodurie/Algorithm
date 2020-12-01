import sys

def mean(data):
    return round(sum(data)/len(data))

def midean(data):
    if N == 1:
        return data[0]
    else:
        if N % 2 == 0:
            return round(data[N//2] + data[N//2 + 1])/2
        else:
            return data[N//2]

def mode(data):
    from collections import Counter

    mode_dic = Counter(data).most_common()
    if len(data) > 1:
        if mode_dic[0][1] == mode_dic[1][1]:
            return mode_dic[1][1]
        else:
            return mode[0][0]
    else:
        return data[0]
        
    
def min_max(data):
    return data[N-1] - data[0]


N = int(sys.stdin.readline())

data = []

for i in range(N):
    data.append(int(sys.stdin.readline()))

data.sort()
print(mean(data))
print(midean(data))
print(mode(data))
print(min_max(data))