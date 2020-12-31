from typing import List


class Solution:
    def sumOfDigits(self, A: List[int]) -> int:
        # min_num = min(A)
        # result = list(map(int, str(min_num)))
        # print(str(sum(result)))
        # return sum(result)
        return sum(map(int, str(min(A)))) & 1 ^ 1


obj = Solution()
A = [34, 23, 10, 24, 75, 33, 54, 80]
obj.sumOfDigits(A)
