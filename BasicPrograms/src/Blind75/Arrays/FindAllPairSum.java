package Blind75.Arrays;

import java.util.*;

public class FindAllPairSum {

    public static void main(String[] args) {

        System.out.println("Input: nums = [2, 4, 3, 5, 6, -2, 4, 7, 8, 9], target = 7");
        printList(findAllPairsSum(7, new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9, 3, 4}));

        System.out.println("\n\nInput: nums = [2, 4, 3, 5, 6, -2, 4, 7, 8, 9], target = 7");
        printList(findAllPairsSum(7, new int[]{3, 4, 4, 3, 3, 4, 3}));
    }

    public static List<int[]> findAllPairsSum(int sum, int[] numbers) {

        List<int[]> resultList = new LinkedList<>();
        Map<Integer, Integer> pairs = new HashMap();

        for (int i : numbers) {
            if (pairs.containsKey(i)) {
//              if (pairs.get(i) != null) {
                if (pairs.get(i) != 0) {
                    resultList.add(new int[]{i, sum - i});
                }
                pairs.remove(sum - i);
//                pairs.put(sum - i, pairs.get(i) - 1);
//                pairs.put(sum - i, null);
            } else if (!pairs.containsValue(i)) {
                pairs.put(sum - i, i);
            }
        }
        return resultList;
    }

    public static void printList(List<int[]> resultList) {
        for (int i = 0; i < resultList.size(); i++) {
            int[] temp = resultList.get(i);
            System.out.print("[" + temp[0] + "," + temp[1] + "] ");
        }
    }
}
