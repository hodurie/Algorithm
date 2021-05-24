# 13:58
def distance(A, B):
    x1, y1 = A
    x2, y2 = B
    return abs(x1-x2) + abs(y1-y2)

def solution(numbers, hand):
    left = '147*'
    right = '369#'

    d = {
        '1':(0, 0), '2':(0, 1), '3':(0, 2),
        '4':(1, 0), '5':(1, 1), '6':(1, 2),
        '7':(2, 0), '8':(2, 1), '9':(2, 2),
        '*':(3, 0), '0':(3, 1), '#':(3, 2),
    }
    
    l = '*'
    r = '#'
    
    answer = ''
    
    for num in numbers:
        n = str(num)
        if n in left:
            l = n
            answer += 'L'
        elif n in right:
            r = n
            answer += 'R'
        else:
            l_dist = distance(d[l], d[n])
            r_dist = distance(d[r], d[n])
            if l_dist == r_dist:
                if hand == 'left':
                    answer += 'L'
                    l = n
                else:
                    answer += 'R'
                    r = n
            elif l_dist > r_dist:
                answer += 'R'
                r = n
            elif l_dist < r_dist:
                answer += 'L'
                l = n
        
    return answer