ham = []
ve = []

for i in range(5):
    if i < 3:
        ham.append(int(input()))
    else:
        ve.append(int(input()))
print(min(ham) + min(ve) - 50)