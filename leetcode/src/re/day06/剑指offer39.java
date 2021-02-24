package re.day06;

import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * <p>
 *  
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 * 限制：
 * <p>
 * 1 <= 数组长度 <= 50000
 */
public class 剑指offer39 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 摩尔投票法
     */
    public int majorityElement1(int[] nums) {
        int votes = 0;
        int x = 0;
        for (int n : nums) {
            if (votes == 0) {
                x = n;
            }
            votes += x == n ? 1 : -1;
        }
        return x;
    }
}
