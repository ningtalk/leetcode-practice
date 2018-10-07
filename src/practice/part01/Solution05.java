package practice.part01;

/**
 * @author np
 * @date 2018/9/29
 */
public class Solution05 {

    // 找到最长回文子串
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end+1);
    }


    // 以left，right为基准向两边比较扩展
    public static int expandAroundCenter(String s, int left, int right) {
        int l = left, r = right;
        while (l >= 0 && r <s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }

    public static void main(String[] args) {
        String s = "ufabbaip";
        System.out.println(longestPalindrome(s));
    }
}
