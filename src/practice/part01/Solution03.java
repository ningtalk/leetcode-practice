package practice.part01;


import java.util.HashSet;
import java.util.Set;

/**
 * @author np
 * @date 2018/9/28
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 */
public class Solution03 {

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        if (s == null || s.length() == 0) {
            return len;
        }

        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }else {
                set.add(s.charAt(j));
                j++;
                len = Math.max(len, j - i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
