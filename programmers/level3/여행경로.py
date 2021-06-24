from collections import defaultdict

def solution(tickets):
    d = defaultdict(lambda: [])

    for a, b in tickets:
        d[a].append(b)

    for v in d.values():
        v.sort(reverse=True)

    res = []

    def dfs(city):
        stack = [city]

        while len(stack) > 0:
            top = stack[-1]

            if top not in d or len(d[top]) == 0:
                res.append(stack.pop())
            else:
                stack.append(d[top].pop())
        return res[::-1]

    dfs('ICN')
    return res[::-1]