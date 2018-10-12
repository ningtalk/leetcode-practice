package practice.part01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author np
 * @date 2018/10/12
 * Z字形变换
 * 题目链接，https://leetcode-cn.com/problems/zigzag-conversion/description/
 */
public class Solution06 {

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }
        int curRow = 0;
        boolean flag = false;
        for (char a: s.toCharArray()) {
            rows.get(curRow).append(a);
            if (curRow == 0 || curRow == numRows - 1) {
                flag = !flag;
            }
            curRow += flag ? 1 : -1;
        }

        StringBuilder re = new StringBuilder();
        for (StringBuilder sb: rows) {
            re.append(sb);
        }
        return re.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
