T = int(input())

for _ in range(T):
    lst = list(input())
    while len(lst) != 0:
        if lst[0] == ")":
            print("NO")
            break
        else:
            if ")" in lst:
                lst.remove(")")
                lst.remove("(")
            else:
                print("NO")
                break
    if len(lst) == 0:
        print("YES")
