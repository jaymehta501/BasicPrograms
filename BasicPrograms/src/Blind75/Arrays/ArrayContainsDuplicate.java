package Blind75.Arrays;

import java.util.HashSet;

public class ArrayContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(isContainsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(isContainsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(isContainsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean isContainsDuplicate(int[] intArr) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < intArr.length; i++) {
            if (!set.add(intArr[i])) {
                return false;
            }
        }
        return true;
    }
}
