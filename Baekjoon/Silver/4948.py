def isPrime(n):    
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True


prime = [False for i in range(246912 + 1)]

for arr in range(2, len(prime)):
    prime[arr] = isPrime(arr)

while True:
    n = int(input())
    if n == 0:
        break
    print(sum(prime[n + 1:2*n + 1]))