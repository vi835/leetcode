package re.day07;

import java.util.HashMap;
import java.util.Map;

public class Question1165 {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> dic = new HashMap<>();
        char[] chars = keyboard.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            dic.put(chars[i], i);
        }
        char[] words = word.toCharArray();
        int length = Math.abs(dic.get(words[0]) - dic.get(chars[0]));
        for (int i = 1; i < words.length; i++) {
            length += Math.abs(dic.get(words[i]) - dic.get(words[i - 1]));
        }
        return length;
    }
}
