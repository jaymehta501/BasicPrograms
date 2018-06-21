package StringExample;

import java.util.HashMap;

public class checkPangram {

	public static void main(String[] args) {
		
		checkStringPangram("The quick brown fox jumps over the lazy dog");
		System.out.println("********************");
		checkStringPangram("The quick brown fox jumps over the dog");
	}
	
	public static void checkStringPangram(String isPangram) {
		
		char[] charArr = isPangram.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<charArr.length; i++) {
			if(map.containsKey(Character.toUpperCase(charArr[i]))) {
				map.put(Character.toUpperCase(charArr[i]), map.get(Character.toUpperCase(charArr[i]))+1);
			} else {				
				map.put(Character.toUpperCase(charArr[i]), 1);
			}
		}
		
		boolean pangram = true;
		
		for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
		    if(map.get(alphabet) == null) {
		    	pangram = false;
		    }
		}
		
		if (pangram == true) {
			System.out.println("String is Pangram.");
		} else {
			System.out.println("Not Pangram.");
		}
		
	}

}