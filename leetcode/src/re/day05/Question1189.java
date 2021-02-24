package re.day05;

import java.util.Arrays;

/**
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 * <p>
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：text = "nlaebolko"
 * 输出：1
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 * 示例 3：
 * <p>
 * 输入：text = "leetcode"
 * 输出：0
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= text.length <= 10^4
 * text 全部由小写英文字母组成
 */
public class Question1189 {
    public int maxNumberOfBalloons(String text) {
        char[] chars = text.toCharArray();
        int numsb = 0;
        int numsa = 0;
        int numsl = 0;
        int numso = 0;
        int numsn = 0;
        for (char c : chars) {
            if (c == 'b') {
                numsb++;
            }
            if (c == 'a') {
                numsa++;
            }
            if (c == 'l') {
                numsl++;
            }
            if (c == 'o') {
                numso++;
            }
            if (c == 'n') {
                numsn++;
            }
        }
        int[] temp = {numsb, numsa, numsl / 2, numso / 2, numsn};
        Arrays.sort(temp);
        return temp[0];
    }
}
