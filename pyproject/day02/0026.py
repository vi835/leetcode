class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        length = len(nums)
        if length == 0 or length == 1:
            return length

        slow = 0
        for i in range(1, length):
            if nums[slow] != nums[i]:
                slow += 1
                nums[slow] = nums[i]
        return slow+1
