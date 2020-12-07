package prac.array.day06;

/**
 * 给你一个整数数组 A，请找出并返回在该数组中仅出现一次的最大整数。
 * <p>
 * 如果不存在这个只出现一次的整数，则返回 -1。
 * <p>
 * 示例 1：
 * 输入：[5,7,3,9,4,9,8,3,1]
 * 输出：8
 * 解释：
 * 数组中最大的整数是 9，但它在数组中重复出现了。而第二大的整数是 8，它只出现了一次，所以答案是 8。
 * 示例 2：
 * 输入：[9,9,8,8]
 * 输出：-1
 * 解释：
 * 数组中不存在仅出现一次的整数。
 *  
 * 提示：
 * 1 <= A.length <= 2000
 * 0 <= A[i] <= 1000
 */
public class Question1133 {
    public int largestUniqueNumber(int[] A) {
        int[] result = new int[10001];
        for (int i = 0; i < A.length; i++) {
            result[A[i]] = result[A[i]] + 1;
        }
        for (int i = 1000; i >= 0; i--) {
            if (result[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
