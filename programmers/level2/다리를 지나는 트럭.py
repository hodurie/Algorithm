from collections import deque

def solution(bridge_length, weight, truck_weights):
    bridge = deque([0] * bridge_length)
    trucks = deque(truck_weights)
    weights = 0
    time = 0
    
    while bridge:
        out = bridge.popleft()
        weights -= out
        time += 1
        
        if trucks:
            if weights + trucks[0] <= weight:
                truck = trucks.popleft()
                bridge.append(truck)
                weights += truck
            else:
                bridge.append(0)
                
    return time