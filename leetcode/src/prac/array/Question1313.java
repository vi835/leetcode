package prac.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * <p>
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * <p>
 * 请你返回解压后的列表。
 * <p>
 * 示例：
 * 输入：nums = [1,2,3,4]
 * 输出：[2,4,4,4]
 * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
 * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
 * 最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
 * <p>
 * 示例 2：
 * 输入：nums = [1,1,2,3]
 * 输出：[1,3,3]
 */
public class Question1313 {
    public int[] decompressRLElist(int[] nums) {
        int half = nums.length / 2;
        List<Integer> list = new ArrayList<>();
        int num = 0;
        int count = 0;
        for (int i = 0; i < half; i++) {
            count = nums[2 * i];
            num = nums[2 * i + 1];
            for (int j = 0; j < count; j++) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int[] decompressRLElist1(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        int[] result = new int[length];
        int count = 0;
        int num = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count = nums[i];
            num = nums[i + 1];
            while (count > 0) {
                result[index] = num;
                count--;
                index++;
            }

        }
        return result;
    }
}
