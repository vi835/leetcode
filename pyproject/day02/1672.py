from typing import List


class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        result = 0
        for value in accounts:
            temp = sum(value)
            result = result if(result > temp) else temp
        return result


obj = Solution()
accounts = [[1, 2, 3], [3, 2, 1]]
print(obj.maximumWealth(accounts))
