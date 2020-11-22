package prac.string.day01;

/**
 * 给你一个字符串 S，请你删去其中的所有元音字母（ 'a'，'e'，'i'，'o'，'u'），并返回这个新字符串。
 * <p>
 * 示例 1：
 * 输入："leetcodeisacommunityforcoders"
 * 输出："ltcdscmmntyfrcdrs"
 * 示例 2：
 * <p>
 * 输入："aeiou"
 * 输出：""
 */
public class Question1119 {
    public String removeVowels(String S) {
        return S.replaceAll("[aeiou]", "");
    }

    public String removeVowels1(String S) {
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
