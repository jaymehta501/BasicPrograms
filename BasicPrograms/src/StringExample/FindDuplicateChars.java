package StringExample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FindDuplicateChars {

	public static void main(String[] args) {
		String usrStr = "abbcccddddeeeeeffffffggggggghhhhhhhhiiiiiiiii";
		findDuplicateCharacter(usrStr);
		System.out.println("/n*********************************");
		findDuplicateWithCount(usrStr);
		
	}
	
	public static void findDuplicateCharacter (String usrStr) {
		
		char[] usrArr = usrStr.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i =0; i<usrArr.length; i++) {
			
			if (set.add(usrArr[i])) {
				
				System.out.println("Duplicate Character:" + usrArr[i]);
			}
		}
		
	}
	
	public static void findDuplicateWithCount (String usrStr1) {
		
		char[] usrArr1 = usrStr1.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		Queue<Character> strQueue = new LinkedList<Character>();
		
		for (int i =0; i<usrArr1.length; i++) {
			
			if (map.containsKey(usrArr1[i])) {
				
				map.put(usrArr1[i], map.get(usrArr1[i])+1);
				
			} else {
				
				map.put(usrArr1[i], 1);
				strQueue.add(usrArr1[i]);
			}
		}
		
		
		while(!strQueue.isEmpty())
		{
			char firstUnique = strQueue.poll();
			if(map.get(firstUnique) > 1)
			{
				System.out.println("Duplicate Character: " + firstUnique + "   ------>   Occurance: "+ map.get(firstUnique));
				
			}
		}
			
	
	}

}
