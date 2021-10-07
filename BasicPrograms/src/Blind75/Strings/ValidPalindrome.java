package Blind75.Strings;

/**
 * https://leetcode.com/problems/valid-palindrome/
 * <p>
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <p>
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        for (int start = 0, end = c.length - 1; start < end; ) {
            if (!Character.isLetterOrDigit(c[start])) start++;
            else if (!Character.isLetterOrDigit(c[end])) end--;
            else if (Character.toLowerCase(c[start++]) != Character.toLowerCase(c[end--]))
                return false;
        }
        return true;
    }
}
