class Solution(object):
    def __init__(self):
        self.two_d_matrix = True
        
    def searchMatrix(self, matrix, target):
        # 2차원 matrix 일 때
        if self.two_d_matrix:
            for i in range(len(matrix)):
                if matrix[i][0] <= target and target <= matrix[i][-1]:
                    matrix = matrix[i]
                    self.two_d_matrix = False
                    return self.searchMatrix(matrix, target)
            return False

        # 1차원 list 일 때
        if len(matrix) == 1 and matrix[0] == target:
            return True
        if len(matrix) == 1 and matrix[0] != target:
            return False

        half = len(matrix) // 2
        if matrix[half] == target:
            return True
        else:
            if matrix[half] > target:
                matrix = matrix[:half]
                return self.searchMatrix(matrix, target)
            else:
                matrix = matrix[half:]
                return self.searchMatrix(matrix, target)