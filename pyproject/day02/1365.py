from typing import List


class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        new_nums = sorted(nums)
        print(new_nums)
        print(nums)
        result = []
        for i in nums:
            result.append(new_nums.index(i))
        return result

    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        counts = [0]*101
        for i in nums:
            counts[i] += 1

        for i in range(1, len(counts)):
            counts[i] += counts[i-1]
        
        result=[]
        for i in nums:
            if(i==0):
                result.append(0)
            else:
                result.append(counts[i-1])
        return result

obj = Solution()
nums = [8, 1, 2, 2, 3]
result = obj.smallerNumbersThanCurrent(nums)
print(result)
