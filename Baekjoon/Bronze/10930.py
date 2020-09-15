from hashlib import sha256

string = input().encode()
print(sha256(string).hexdigest())