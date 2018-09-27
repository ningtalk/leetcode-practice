package practice.part01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author np
 * @date 2018/9/27
 *
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
public class Solution01 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // 测试用例
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        Solution01 solution01 = new Solution01();
        int[] re = solution01.twoSum(nums, target);
        if (re != null) {
            for (int i: re) {
                System.out.print(i + " ");
            }
        }
    }
}
