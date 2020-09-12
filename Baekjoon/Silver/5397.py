# -*- coding: utf-8 -*-
"""
Created on Fri Sep 11 19:11:33 2020

@author: Ho
"""

test_cases = int(input())

for _ in range(test_cases):
    left = []
    right = []
    pwd = input()

    for x in pwd:
        if x == ">":
            if right:
                left.append(right.pop()) 
        elif x=="<":
            if left:
                right.append(left.pop())
        elif x=="-":
            if left:
                left.pop()
        else:
            left.append(x)

  print("".join(left)+"".join(reversed(right)))
