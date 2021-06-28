def solution(dirs):
    direction = {
        'U':(0, 1),
        'D':(0, -1),
        'R':(1, 0),
        'L':(-1, 0),
    }
    visited = []
    x, y = 0, 0
    cnt = 0
    
    for d in dirs:
        nx = x + direction[d][0]
        ny = y + direction[d][1]
        
        if nx < -5 or nx > 5 or ny < -5 or ny > 5:
            continue

        if (x, y, nx, ny) not in visited and (nx, ny, x, y) not in visited:
            visited.append((x, y, nx, ny))

        x = nx
        y = ny
    
    return len(visited)