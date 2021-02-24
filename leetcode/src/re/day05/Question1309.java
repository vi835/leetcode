package re.day05;

import java.util.Arrays;

/**
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 * <p>
 * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
 * 返回映射之后形成的新字符串。
 * <p>
 * 题目数据保证映射始终唯一。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "10#11#12"
 * 输出："jkab"
 * 解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 * 示例 2：
 * <p>
 * 输入：s = "1326#"
 * 输出："acz"
 * 示例 3：
 * <p>
 * 输入：s = "25#"
 * 输出："y"
 * 示例 4：
 * <p>
 * 输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
 * 输出："abcdefghijklmnopqrstuvwxyz"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s[i] 只包含数字（'0'-'9'）和 '#' 字符。
 * s 是映射始终存在的有效字符串。
 */
public class Question1309 {
    public String freqAlphabets(String s) {
        char[] maps = new char[27];
        for (int i = 1; i < maps.length; i++) {
            maps[i] = (char) (96 + i);
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                int temp = (chars[i] - '0') * 10 + chars[i + 1] - '0';
                sb.append(maps[temp]);
                i += 3;
            } else {
                sb.append(maps[chars[i] - '0']);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        char[] maps = new char[27];
        for (int i = 1; i < maps.length; i++) {
            maps[i] = (char) (96 + i);
        }
        System.out.println(Arrays.toString(maps));
        System.out.println('3' - '0');
    }
}
