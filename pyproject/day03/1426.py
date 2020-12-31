print((1 == 1)+(1 == 1))


class Solution:
    def countElements(self, arr: List[int]) -> int:
        arr_set = set(arr)
        return sum(i+1 in arr_set for i in arr)
