def solution(record):
    uid = {}
    states = []
    
    for rc in record:
        s = rc.split( )
        if s[0] == 'Enter':
            states.append(["님이 들어왔습니다.", s[1]])
            uid[s[1]] = s[2]
        elif s[0] == 'Leave':
            states.append(['님이 나갔습니다.', s[1]])
        elif s[0] == 'Change':
            uid[s[1]] = s[2]
            
    return [uid[s[1]]+s[0] for s in states]