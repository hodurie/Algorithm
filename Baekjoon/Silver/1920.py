# -*- coding: utf-8 -*-
"""
Created on Mon Sep 14 17:20:30 2020

@author: Ho
"""

n = input()
arr = set(map(int, input().split()))
m = input()
lst = list(map(int, input().split()))

for i in lst:
    if i in arr:
        print('1')
    else:
        print('0')