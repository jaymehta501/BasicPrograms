import java.util.LinkedHashSet;
import java.util.Set;

public class test {
	
	public static void main(String[] args) {
		findSubstringsWithKDistinctCharacters("awaglknagawunagwkwagl", 4);
	}
	
	public static void findSubstringsWithKDistinctCharacters(String s, int k) {
	    char[] letters = s.toCharArray();

	    for (int i = 0, n = letters.length - k; i <= n; i++) {
	        Set<String> uniques = new LinkedHashSet<String>();
	        String temp = "";
	        
	        for (int j = i, m = i + k; j < m; j++) {
	            uniques.add(temp + letters[j]);
	        }

	        if (uniques.size() == k) {
	            System.out.println("substring : " + uniques);
	        }
	    }
	}
}
