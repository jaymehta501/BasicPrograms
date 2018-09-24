package Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestSubString {

	public static void main(String[] args) {
		findSubstringsWithKDistinctCharacters("awaglknagawunagwkwagl", 4);
	}
	
	public static void findSubstringsWithKDistinctCharacters(String s, int k) {
	    char[] letters = s.toCharArray();

	    for (int i = 0, n = letters.length - k; i <= n; i++) {
	        Set<Character> uniques = new LinkedHashSet<Character>();

	        for (int j = i, m = i + k; j < m; j++) {
	            uniques.add(letters[j]);
	        }

	        if (uniques.size() == k) {
	            System.out.println("substring : " + uniques);
	        }
	    }
	}
}