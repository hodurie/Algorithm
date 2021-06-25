def solution(routes):
    routes.sort(key=lambda x: (x[1], x[0]))
    cameras = []

    for route in routes:
        if len(cameras) == 0:
            cameras.append(route[1])
        else:
            top = cameras[-1]
            if route[0] <= top <= route[1]:
                continue

            if route[0] > top:
                cameras.append(route[1])

    return len(cameras)