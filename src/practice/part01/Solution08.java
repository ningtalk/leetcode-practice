package practice.part01;

/**
 * @author np
 * @date 2018/11/18
 */
public class Solution08 {

    public static int myAtoi(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }

        str = str.trim();
        char[] strs = str.toCharArray();

        char first;
        if (strs[0] == 43) {
            first = strs[0];
        } else if (strs[0] == 45) {
            first = strs[0];
        } else if (strs[0] > 47 && strs[0] < 58) {
            first = strs[0];
        } else {
            return 0;
        }

        StringBuilder strb = new StringBuilder();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i] > 47 && strs[i] < 58) {
                strb.append(strs[i]);
            }
        }
        return 0;
    }
}
