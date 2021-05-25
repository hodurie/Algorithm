import heapq

def solution(scoville, K):
    heap = scoville
    heapq.heapify(heap)
    
    cnt = 0
    
    while heap[0] < K:
        if len(heap) >= 2:
            a = heapq.heappop(heap)
            b = heapq.heappop(heap)
            if a >= K:
                return cnt
            num = a + (b * 2)
            heapq.heappush(heap, num)
            cnt += 1
        else:
            return -1            
        
    return cnt