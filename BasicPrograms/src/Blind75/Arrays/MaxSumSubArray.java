package Blind75.Arrays;

/* https://leetcode.com/problems/maximum-subarray/
https://www.youtube.com/watch?v=HCL4_bOd3-4

 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 A subarray is a contiguous part of an array.
 Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
        Input: nums = [1]
        Output: 1

Example 3:
        Input: nums = [5,4,-1,7,8]
        Output: 23
*/

public class MaxSumSubArray {

    public static void main(String[] args) {

        System.out.println(findMAxSubArra1(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(findMAxSubArra1(new int[]{1}));
        System.out.println(findMAxSubArra1(new int[]{5, 4, -1, 7, 8}));
    }

    public static int findMaxSubArr(int[] usrArr) {

        int maxSum = usrArr[0];
        int currentSum = maxSum;

        for (int i = 1; i < usrArr.length; i++) {
            currentSum = Math.max(usrArr[i] + currentSum, usrArr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static int findMAxSubArra1(int[] usrArr) {
        int maxSum = usrArr[0];
        int currSum = maxSum;

        for (int i = 1; i < usrArr.length; i++) {
            currSum = currSum + usrArr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            } else if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
