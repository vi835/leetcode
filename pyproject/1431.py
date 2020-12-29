class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        maxCandy = max(candies)
        result = []
        for value in candies:
            result.append(value+extraCandies >= maxCandy)
        return result
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """

obj = Solution()
candies = [2, 3, 5, 1, 3]
extraCandies = 3
result=obj.kidsWithCandies(candies, extraCandies)
print(result)

