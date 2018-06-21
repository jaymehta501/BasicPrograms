package StringExample;

import java.util.HashMap;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		maxOccuringCharsInString("Geeks for Geeks Geeks.");
	}
	
	public static void maxOccuringCharsInString(String usrString){
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i<usrString.length(); i++) {
			if(map.containsKey(usrString.charAt(i))){
				map.put(usrString.charAt(i), map.get(usrString.charAt(i))+1);
			}else {
				map.put(usrString.charAt(i), 1);
			}
		}
		
		char temp = ' ';
		int temp1 = 0;
		
		for (int j = 0; j < usrString.length(); j++) {
			if(map.get(usrString.charAt(j)) > temp1) {
				temp = usrString.charAt(j);
				temp1 = map.get(usrString.charAt(j));
			}
		}
		
		System.out.println("Maximum occured character: " + temp + " ---> " + map.get(temp));
	}
}
