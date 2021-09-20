package Blind75.Strings;

import java.util.Arrays;

public class ValidAnagrams {

    public static void main (String[] args) {
        System.out.println("anagram , nagaram -> " + isValidAnagrams("anagram", "nagaram"));
        System.out.println("car , rat -> " +  isValidAnagrams("car", "rat"));
        System.out.println("test , empty string -> " +  isValidAnagrams("test", ""));
    }

    public static boolean isValidAnagrams(String str1, String str2) {

        int len1, len2;
        len1 = str1.length();
        len2 = str2.length();

        char[] s1Array;
        char[] s2Array;

        if (len1 == len2) {

            s1Array = str1.toCharArray();
            s2Array = str2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if (Arrays.equals(s1Array, s2Array)) {
                return true;
            } else {
                return false; }

        } else {
            return false;
        }
    }
}
