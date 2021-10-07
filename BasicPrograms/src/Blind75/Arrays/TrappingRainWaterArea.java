package Blind75.Arrays;

/**
https://leetcode.com/problems/container-with-most-water/

 Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are
 drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container,
 such that the container contains the most water.

 Notice that you may not slant the container.

 Input: height = [1,8,6,2,5,4,8,3,7]
 Output: 49
 Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
*/


public class TrappingRainWaterArea {

    public static void main(String[] args) {
        System.out.println(findMaxArea(new int[]{1, 1}));
        System.out.println(findMaxArea(new int[]{4, 3, 2, 1, 4}));
        System.out.println(findMaxArea(new int[]{1, 2, 1}));
        System.out.println(findMaxArea(new int[]{3, 1, 2, 4, 0, 1, 3, 2}));
        System.out.println(findMaxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(findMaxArea(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));

        System.out.println("************************************");

        System.out.println(computeTrapWater(new int[]{1, 1}));
        System.out.println(computeTrapWater(new int[]{4, 3, 2, 1, 4}));
        System.out.println(computeTrapWater(new int[]{1, 2, 1}));
        System.out.println(computeTrapWater(new int[]{3, 1, 2, 4, 0, 1, 3, 2}));
        System.out.println(computeTrapWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(computeTrapWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    // https://www.youtube.com/watch?v=UZG3-vZlFM4
    // Space Complexity - O(n)
    // Time complexity - O(n)
    public static int findMaxArea(int[] height) {
        int resultArea = 0;

        int length = height.length;
        int[] left = new int[length];
        int[] right = new int[length];

        left[0] = height[0];
        for (int i = 1; i < length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        right[length - 1] = height[length - 1];
        for (int j = length - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], height[j]);
        }

        for (int k = 0; k < length; k++) {
            resultArea = resultArea + (Math.min(right[k], left[k]) - height[k]);
        }

        return resultArea;
    }

    //https://interviewdaemon.com/courses/two-pointers/lessons/trapping-rain-water/
    //https://leetcode.com/problems/trapping-rain-water/solution/
    // time complexity O(N)
    //Space Complexity: O(1)
    private static int computeTrapWater(int[] height) {
        int left = 0; // start of array
        int right = height.length - 1; // last index of the array
        int totalWater = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) { // leftMax is smaller than rightMax,
                // so the (leftMax-height[left]) water can be stored on the left side of current left bar
                totalWater = totalWater + (leftMax - height[left]); // we store this water and move forward
                left++;
            } else { // rightMax is smaller than leftMax meaning
                // so the (rightMax-height[right]) water can be stored on the right side of current right bar
                totalWater = totalWater + (rightMax - height[right]);
                right--;
            }
        }
        return totalWater;
    }
}