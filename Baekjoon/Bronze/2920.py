# -*- coding: utf-8 -*-
"""
Created on Wed Sep  9 16:11:24 2020

@author: Ho
"""

lst = [int(i) for i in input().split()]

asc = 0
des = 0

for i in range(1, 8):
    temp = lst[0] - lst[i]
    if temp == -i:
        asc += 1
    elif temp == i:
        des += 1
    else:
        print("mixed")
        break
    
if asc == 7:
    print('ascending')
elif des == 7:
    print('descending')
