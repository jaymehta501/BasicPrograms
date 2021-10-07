package Blind75.Arrays;

/**
https://www.youtube.com/watch?v=bNvIQI2wAjk

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

        Example 1:
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
        Example 2:

        Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]
        */

public class ProductExceptSelf {

    public static void main(String[] args) {

        printArray(productExceptSelf(new int[]{1, 2, 3, 4}));

        System.out.println();

        printArray(productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    public static int[] productExceptSelf(int[] usrArr) {
        System.out.print("Original Array - ");
        printArray(usrArr);

        int[] output = new int[usrArr.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < usrArr.length; i++) {
            output[i] = prefix;
            prefix = prefix * usrArr[i];
        }

        System.out.print("Prefix Array - ");
        printArray(output);

        for (int i = usrArr.length - 1; i >= 0; i--) {
            output[i] = output[i] * postfix;
            postfix = postfix * usrArr[i];
        }

        return output;
    }

    public static void printArray(int[] usrArr) {
        for (int i = 0; i < usrArr.length; i++) {
            System.out.print(usrArr[i] + " ");
        }
        System.out.println();
    }
}
