package Blind75.Strings;

/**
https://leetcode.com/problems/longest-substring-without-repeating-characters/
https://www.youtube.com/watch?v=9Kc0eZBGL1U

// Given a string s, find the length of the longest substring without repeating characters.
        Example 1:
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.

        Example 2:
        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.

        Example 3:
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        Example 4:
        Input: s = ""
        Output: 0
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Chars {

    public static void main(String[] args) {
        System.out.println(printLengthLongestSubstringWithoutRepeatingChars("abcabcbb"));
        System.out.println(printLengthLongestSubstringWithoutRepeatingChars("bbbbb"));
        System.out.println(printLengthLongestSubstringWithoutRepeatingChars("pwwkew"));
        System.out.println(printLengthLongestSubstringWithoutRepeatingChars(""));

        System.out.println("---------------------------");

        System.out.println(printLengthLongestSubstringWithoutRepeatingChars_Map("abcabcbb"));
        System.out.println(printLengthLongestSubstringWithoutRepeatingChars_Map("bbbbb"));
        System.out.println(printLengthLongestSubstringWithoutRepeatingChars_Map("pwwkew"));
        System.out.println(printLengthLongestSubstringWithoutRepeatingChars_Map(""));
    }

    public static int printLengthLongestSubstringWithoutRepeatingChars(String usrString) {

        if (usrString.length() == 0) return 0;

        int start = 0;
        int end = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (end < usrString.length()) {
            if (!set.contains(usrString.charAt(end))) {
                set.add(usrString.charAt(end));
                end++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(usrString.charAt(start));
                start++;
            }
        }

        return max;
    }

    public static int printLengthLongestSubstringWithoutRepeatingChars_Map(String usrString) {
        if (usrString.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int ans = 1;

        for (int i = 0, j = 0; i < usrString.length(); i++) {
            char ch = usrString.charAt(i);
            while (map.containsKey(ch)) {
                char chj = usrString.charAt(j);
                map.put(chj, map.get(chj) - 1);
                if (map.get(chj) <= 0) {
                    map.remove(chj);
                    ans = Math.max(ans, i - j);
                }
                j++;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return Math.max(ans, map.size());
    }

}
