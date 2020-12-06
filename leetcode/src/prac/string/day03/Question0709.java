package prac.string.day03;

import java.sql.SQLOutput;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * <p>
 * 示例 1：
 * 输入: "Hello"
 * 输出: "hello"
 * <p>
 * 示例 2：
 * 输入: "here"
 * 输出: "here"
 * <p>
 * 示例 3：
 * 输入: "LOVELY"
 * 输出: "lovely"
 */
public class Question0709 {
    public static void main(String[] args) {
        boolean a = (('A' + 32) == 'a');
        System.out.println('a' + 32);
        System.out.println(a);
    }

    /**
     * 位运算
     * 根据评论区@Alfeim的总结：
     * 大写变小写、小写变大写 : 字符 ^= 32;
     * 大写变小写、小写变小写 : 字符 |= 32;
     * 小写变大写、大写变大写 : 字符 &= -33;
     *
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 'a' - 'A');
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
