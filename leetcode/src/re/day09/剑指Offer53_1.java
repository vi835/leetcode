package re.day09;

/**
 * 统计一个数字在排序数组中出现的次数。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 */
public class 剑指Offer53_1 {
    public int search(int[] nums, int target) {
        int result = 0;
        if (nums.length == 0) {
            return result;
        }
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                result++;
            } else if (nums[i] > target) {
                break;
            }
        }
        return result;
    }
}
