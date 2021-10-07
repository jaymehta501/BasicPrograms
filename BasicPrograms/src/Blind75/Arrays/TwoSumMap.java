package Blind75.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
https://www.youtube.com/watch?v=KLlXCFG5TnA
https://leetcode.com/problems/two-sum/

Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]
        */

public class TwoSumMap {

    public static void main(String[] args) {

        System.out.println("Input: nums = [2,7,11,15], target = 9");
        printArray(twoSum(new int[]{2,7,11,15}, 9));

        System.out.println("\nInput: nums = [3,2,4], target = 6");
        printArray(twoSum(new int[]{3,2,4}, 6));

        System.out.println("\nInput: nums = [3,3], target = 6");
        printArray(twoSum(new int[]{3,3}, 6));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {

            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            } else {
                map.put(numbers[i], i);
            }
        }
        return result;
    }

    public static void printArray (int[] result){
        for (int i = 0; i < result.length; i++) {System.out.print(result[i] + " ");}
    }
}
