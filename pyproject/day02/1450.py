class Solution:
    def busyStudent(self, startTime: List[int], endTime: List[int], queryTime: int) -> int:
        result = 0
        for i in range(0, len(startTime)):
            if startTime[i] <= queryTime and endTime[i] >= queryTime:
                result += 1
        return result
