package prac.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个整数数组 nums 。
 * <p>
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 * <p>
 * 返回好数对的数目。
 * <p>
 * 示例 1：
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 * <p>
 * 示例 2：
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对
 * <p>
 * 示例 3：
 * 输入：nums = [1,2,3]
 * 输出：0
 */
public class Question1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int value = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            value = entry.getValue();
            if (value > 1) {
                result += (value * value - value) / 2;
            }
        }
        return result;
    }

    public int numIdenticalPairs1(int[] nums) {
        int[] temp = new int[101];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] += 1;
        }
        int result = 0;
        int value = 0;
        for (int i = 0; i < temp.length; i++) {
            value = temp[i];
            if (value > 1) {
                result += (value * value - value) / 2;
            }
        }
        return result;
    }
}
