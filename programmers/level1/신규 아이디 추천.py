def solution(new_id):
    import re
    answer = ''
    
    new_id = new_id.lower()
    
    for s in new_id:
        if s.isalpha() or s.isdigit() or s in ['-','_','.']:
            answer += s
    p = re.compile('[\.]{2,}')
    answer = p.sub('.', answer)
    
    if answer.startswith('.'):
        answer = answer[1:]
    if answer.endswith('.'):
        answer = answer[:-1]
    if answer == "":
        answer += 'a'
    if len(answer) >= 16:
        answer = answer[:15]
        if answer.endswith('.'):
            answer = answer[:-1]
    if len(answer) < 3:
        for _ in range(3 - len(answer)):
            answer += answer[-1]
            
    return answer