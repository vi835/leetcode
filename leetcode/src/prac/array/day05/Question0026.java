package prac.array.day05;

import java.util.Arrays;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class Question0026 {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length;i++ ) {
            if (nums[slow] == nums[i]) {
            }else{
                nums[++slow]=nums[i];
            }
        }
        return slow+1;
    }
}
