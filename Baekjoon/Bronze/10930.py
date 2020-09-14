# -*- coding: utf-8 -*-
"""
Created on Mon Sep 14 17:15:06 2020

@author: Ho
"""

from hashlib import sha256

string = input().encode()
print(sha256(string).hexdigest())