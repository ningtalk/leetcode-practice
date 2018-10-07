package practice.part01;

/**
 * @author np
 * @date 2018/10/7
 * 回文数
 */
public class Solution09 {

    // 将数字转换成字符串，从字符串两端循环比较
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        boolean re = true;
        String s = String.valueOf(x);
        int i = 0, j = s.length()-1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)){
                re = false;
                break;
            }else {
                i++;
                j--;
            }
        }

        return re;
    }

    public static void main(String[] args) {
        int a = 123, b = -121, c = 121, d =123321;
        System.out.println("a: " + isPalindrome(a));
        System.out.println("b: " + isPalindrome(b));
        System.out.println("c: " + isPalindrome(c));
        System.out.println("d: " + isPalindrome(d));
    }
}
