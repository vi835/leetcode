class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for value in nums:
            if len(str(value)) % 2 == 0:
                count += 1
        return sum(1 for value in nums if len(str(value)) % 2 == 0)

