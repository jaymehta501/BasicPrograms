package StringExample;

import java.util.HashMap;
import java.util.Set;

public class duplicateWordsInString {

	public static void main(String[] args) {

		findDuplicates("Bread butter and bread");
		System.out.println("****************");
		findDuplicates("Java is java again java");
		System.out.println("****************");
		findDuplicates("Super Man Bat Man Spider Man Bat");

	}
	
	static void findDuplicates(String usrString) {
		
		String[] usrArr = usrString.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i=0; i<usrArr.length; i++) {
			
			if(map.containsKey(usrArr[i])) {
				map.put(usrArr[i],map.get(usrArr[i])+1);
			} else {
				map.put(usrArr[i],1);
			}
		}
		
		 Set<String> wordsInString = map.keySet();
		 
	        //Iterating through all words in wordCount
	 
	        for (String word : wordsInString)
	        {
	            //if word count is greater than 1
	 
	            if(map.get(word) > 1)
	            {
	                //Printing that word and it's count
	 
	                System.out.println(word+" : "+map.get(word));
	            }
	        }
	    }

}
