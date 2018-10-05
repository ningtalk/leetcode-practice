package practice.part01;

/**
 * @author np
 * @date 2018/10/5
 * 两个排序数组的中位数
 */
public class Solution04 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m || j < n) {
            if (i >= m) {
                nums[k++] = nums2[j++];
                continue;
            }
            if (j >= n) {
                nums[k++] = nums1[i++];
                continue;
            }
            if (nums1[i] > nums2[j]) {
                nums[k++] = nums2[j++];
            }else {
                nums[k++] =nums1[i++];
            }

        }

        for (int a = 0; a < nums.length; a++) {
            System.out.println(nums[a]);
        }


        // 计算中卫数
        if( (m + n) % 2 == 0 ) {
            return (nums[(m + n) / 2] + nums[(m + n) /2 - 1]) / 2.0;
        }else {
            return nums[(m + n) / 2];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
