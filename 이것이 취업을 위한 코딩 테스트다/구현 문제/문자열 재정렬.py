s = input()

string = ""
number = 0

for i in s:
    if i.isalpha():
        string += i
    else:
        number += int(i)

string = "".join(sorted(string))

if number != 0:
    string += str(number)

print(string)