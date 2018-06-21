package StringExample;

import java.util.HashMap;

public class getSecondMostFreq {

	public static void main(String[] args) {
		getSecondMostFreqChar("Hello World!");
	}
	
	public static void getSecondMostFreqChar(String usrString){
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i<usrString.length(); i++) {
			if(map.containsKey(usrString.charAt(i))){
				map.put(usrString.charAt(i), map.get(usrString.charAt(i))+1);
			}else {
				map.put(usrString.charAt(i), 1);
			}
		}
		
		char First = ' ';
		int First1 = 0;
		
		char Second = ' ';
		int Second1 = 0;
		
		for (int j = 0; j < usrString.length(); j++) {
			if(map.get(usrString.charAt(j)) > First1) {
				
				Second = First;
				Second1 = First1;
				
				First = usrString.charAt(j);
				First1 = map.get(usrString.charAt(j));
				
			} else if ((map.get(usrString.charAt(j)) > Second1) && !(map.get(usrString.charAt(j)) == First1)) {
				
				Second = usrString.charAt(j);
				Second1 = map.get(usrString.charAt(j));
			}
		}
		
		System.out.println("Maximum occured character: " + Second + " ---> " + map.get(Second));
	}
}
