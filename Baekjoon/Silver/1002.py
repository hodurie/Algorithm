# -*- coding: utf-8 -*-
"""
Created on Sun Aug 23 20:08:46 2020

@author: Ho
"""
T = int(input())

for i in range(T):
    x1,y1,r1,x2,y2,r2 = map(int, input().split())
    d = ((x1-x2)**2 + (y1-y2)**2)**(1/2) # 거리 계산

    
    r = r1 + r2 # 두 길이의 합
    l = max(r1, r2) # 두 길이중 큰 값
    s = min(r1, r2) # 두 길이 중 작은 값

    if (x1 == x2 and y1 == y2) : # (x1,y1) == (x2,y2)
        if r1 == r2 : # 동일 원
            print(-1)
        else :  # not 동일 원
            print(0)
    elif d > r : # 만나지 않음 (서로 멀리 떨어져 있는 두 원)
        print(0)
    elif d == float(r) : # 1 점에서 만남(외접)
        print(1)
    else :
        if d + s < l: # 원안에 원 만나지 않음
            print(0)
        elif d + s  == float(l) : # 1 점에서 만남(내접)
            print(1)
        else : 
            print(2)