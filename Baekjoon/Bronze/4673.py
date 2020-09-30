def d(n):  
    result = n
    while n != 0:
        result += n%10
        n //= 10
    return result
 
lst = []
 
for i in range(1,10001):
  lst.append(d(i))
  if i not in lst:
    print(i)