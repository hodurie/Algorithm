class Solution(object):
    def isHappy(self, n):
        array = []
        while True:
            s = str(n)
            num = 0
            for i in range(len(s)):
                num += int(s[i])**2
            
            n = num
            
            if n in array:
                return False
            
            if n == 1:
                return True
            
            array.append(n)