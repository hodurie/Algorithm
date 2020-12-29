n, m = map(int, input().split())

n_data = set(input() for i in range(n))
m_data = set(input() for i in range(m))

nm = n_data & m_data

print(len(nm))

for i in sorted(nm):
    print(i)