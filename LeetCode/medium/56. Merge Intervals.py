class Solution(object):
    def merge(self, intervals):
        intervals.sort()
        array = [intervals[0]]
        a, b = array[0][0], array[0][1]

        for i in range(1, len(intervals)):
            c, d = intervals[i][0], intervals[i][1]
            if b < c:
                array.append(intervals[i])
                a, b = intervals[i][0], intervals[i][1]
            else:
                array[-1][1] = max(array[-1][1], intervals[i][1])
                a, b = array[-1][0], array[-1][1]
        return array