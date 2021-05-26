def solution(a, b):
    # 2월 29일
    day = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    total = sum(day[i] for i in range(a-1)) + b

    date = ['THU', 'FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED']
    
    return date[total % 7]