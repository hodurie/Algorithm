# -*- coding: utf-8 -*-
"""
Created on Wed Sep  9 16:42:45 2020

@author: Ho
"""

N, M = [int(i) for i in input().split()]
lst = [int(i) for i in input().split()]

max_val = 0
for i in range(N - 2):
    for j in range(i + 1, N - 1):
        temp = 0
        for k in range(j + 1, N):
            temp = lst[i] + lst[j] + lst[k]
            if temp <= M:
                if temp >= max_val:
                    max_val = temp
print(max_val)
