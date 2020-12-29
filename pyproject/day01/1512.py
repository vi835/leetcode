from typing import List


class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        dic = {}
        for value in nums:
            dic[value] = dic.get(value, 0)+1
        sum = 0
        for v in dic.values():
            sum += (v*v-v)//2
        return sum


obj = Solution()
nums = [1, 2, 3, 1, 1, 3]
result = obj.numIdenticalPairs(nums)
print(result)
