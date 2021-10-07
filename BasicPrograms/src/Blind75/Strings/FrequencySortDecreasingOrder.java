package Blind75.Strings;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
// Given a string s, sort it in decreasing order based on the frequency of the characters.
// The frequency of a character is the number of times it appears in the string.
// Return the sorted string. If there are multiple answers, return any of them.

        Example 1:

        Input: s = "tree"
        Output: "eert"
        Explanation: 'e' appears twice while 'r' and 't' both appear once.
        So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

        Example 2:
        Input: s = "cccaaa"
        Output: "aaaccc"
        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
        Note that "cacaca" is incorrect, as the same characters must be together.

        Example 3:
        Input: s = "Aabb"
        Output: "bbAa"
        Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
        Note that 'A' and 'a' are treated as two different characters.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySortDecreasingOrder {

    public static void main(String[] args) {
        System.out.println(frequencySort("dccbbaaa"));
        System.out.println(frequencySort("abcd"));
        System.out.println(frequencySort("eerttr"));
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort(""));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> queue = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));

        for (char ch : s.toCharArray()) {map.put(ch, map.getOrDefault(ch, 0) + 1);}
        queue.addAll(map.keySet());

        StringBuffer sb = new StringBuffer();
        while (!queue.isEmpty()) {
            char ch = queue.poll();
            for (int i = 0; i < map.get(ch); i++)
                sb.append(ch);
        }

        return sb.toString();
    }

}
