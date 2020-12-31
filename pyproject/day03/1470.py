class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        before = nums[:n]
        last = nums[n:]
        result = []
        for i in range(0, n):
            result.append(before[i])
            result.append(last[i])
        return result
