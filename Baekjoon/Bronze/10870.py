n = int(input())
 
def fibo(n):
    if n == 0:
        return 1
    if n == 1:
        return 1
    return fibo(n-1) + fibo(n-2)
 
if n == 0:
    print(0)
else:
    print(fibo(n-1))