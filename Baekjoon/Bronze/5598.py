s = list(input())
print(''.join([
    # Z -> W, A -> X, B -> Y, C -> Z
    chr(ord('Z') - (ord('C') - ord(i))) if ord(i) - 3 < ord('A') else chr(ord(i) - 3) for i in s]))
