A, B, V = map(int, input().split())

cnt = (V - B) // (A - B)

print(cnt if (V - B) % (A - B) == 0 else cnt + 1)