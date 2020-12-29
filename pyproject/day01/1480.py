class Solution(object):
    def runningSum(self, nums):
        result = []
        sum = 0
        # for value in nums:
        for value in range(0,len(nums)):
            sum += value
            result.append(sum)
        return result
        """
        :type nums: List[int]
        :rtype: List[int]
        """
    
    def runningSum(self, nums):
        for i in range(1,len(nums)):
            nums[i]=nums[i]+nums[i-1]
        return nums

