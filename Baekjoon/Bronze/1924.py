m, d = map(int, input().split())

lst = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
dates = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

hap = sum(lst[:m]) + d

print(dates[hap % 7])