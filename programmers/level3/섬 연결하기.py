def solution(n, costs):
    visited = set()
    costs.sort(key = lambda x : x[2])
    total = 0
    visited.add(0)
    
    while len(visited) != n:
        for a, b, cost in costs:
            if a in visited or b in visited:
                if a in visited and b in visited:
                    continue
                
                else:
                    visited.add(a)
                    visited.add(b)
                    total += cost
                    break

    return total