package Blind75.Arrays;

/* https://leetcode.com/problems/maximum-product-subarray/
 https://www.youtube.com/watch?v=vtJvbRlHqTA

 Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
 It is guaranteed that the answer will fit in a 32-bit integer.
 A subarray is a contiguous subsequence of the array.
 Example 1:
      Input: nums = [2,3,-2,4]
      Output: 6
      Explanation: [2,3] has the largest product 6.

      Example 2:
      Input: nums = [-2,0,-1]
      Output: 0
      Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/

public class MaxProductSubArray {

    public static void main(String[] args) {

        System.out.println(findMaxProductSubArr(new int[]{2, 3, -2, 4}));
        System.out.println(findMaxProductSubArr(new int[]{-2, 0, -1}));

        System.out.println(findMaxProductSubArr1(new int[]{2, 3, -2, 4}));
        System.out.println(findMaxProductSubArr1(new int[]{-2, 0, -1}));
    }

    public static int findMaxProductSubArr(int[] usrArr) {

        int curr_max_Product = usrArr[0];
        int curr_min_Product = usrArr[0];
        int prev_max_product = usrArr[0];
        int prev_min_product = usrArr[0];
        int result_max_product = usrArr[0];

        for (int i = 1; i < usrArr.length; i++) {

            curr_max_Product = Math.max(Math.max(prev_max_product * usrArr[i], prev_min_product * usrArr[i]), usrArr[i]);
            curr_min_Product = Math.min(Math.min(prev_max_product * usrArr[i], prev_min_product * usrArr[i]), usrArr[i]);
            result_max_product = Math.max(result_max_product, curr_max_Product);
            prev_max_product = curr_max_Product;
            prev_min_product = curr_min_Product;
        }

        return result_max_product;
    }


    public static int findMaxProductSubArr1(int[] a) {
        if (a == null || a.length == 0)
            return 0;

        int result_max_product = a[0], min = result_max_product, max = result_max_product;

        for (int i = 1; i < a.length; i++) {
            if (a[i] >= 0) {
                max = Math.max(a[i], max * a[i]);
                min = Math.min(a[i], min * a[i]);
            } else {
                int tmp = max;
                max = Math.max(a[i], min * a[i]);
                min = Math.min(a[i], tmp * a[i]);
            }

            result_max_product = Math.max(result_max_product, max);
        }
        return result_max_product;
    }
}
