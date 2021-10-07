package Blind75.Arrays;

/**
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
https://www.youtube.com/watch?v=IzHR_U8Ly6c
https://www.youtube.com/watch?v=Le8bc8aHgBA
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example 1:
        Input: nums = [3,4,5,1,2]
        Output: 1
        Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:
        Input: nums = [4,5,6,7,0,1,2]
        Output: 0
        Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:
        Input: nums = [11,13,15,17]
        Output: 11
        Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
        */

public class FindMinimumSortedRotatedArray {

    public static void main(String[] args) {

        System.out.println("[3,4,5,1,2] --------> " + findMinimumElement(new int[]{3, 4, 5, 1, 2}));
        System.out.println("[4,5,6,7,0,1,2] --------> " + findMinimumElement(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println("[11,13,15,17] --------> " + findMinimumElement(new int[]{11, 13, 15, 17}));
    }

    public static int findMinimumElement(int[] usrArray) {

        if (usrArray.length == 0) { return -1; }
        if (usrArray.length == 1) { return usrArray[0]; }

        int left = 0;
        int right = usrArray.length - 1;

        while (left < right) {

            int midPoint = left + (right - left) / 2;

            if (midPoint > 0 && usrArray[midPoint] < usrArray[midPoint - 1]) {
                return usrArray[midPoint];
            } else if (usrArray[left] <= usrArray[midPoint] && usrArray[midPoint] > usrArray[right]) {
                left = midPoint + 1;
            } else {
                right = midPoint - 1;

            }
        }
        return usrArray[left];
    }
}
