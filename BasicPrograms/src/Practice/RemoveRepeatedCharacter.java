package Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveRepeatedCharacter {

public static void main(String[] args) {
		
		System.out.println("Please Enter a String: ");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		
		FirstNonRepeatingCharacter(userInput);
		
	}

	public static void FirstNonRepeatingCharacter(String userInput) {
		// TODO Auto-generated method stub
		
		char[] charArr = userInput.toCharArray();
		HashMap<Character, Integer> mapArr = new HashMap<Character, Integer>();
		
		for (int i=0; i < charArr.length; i++){
			
			if(mapArr.containsKey(charArr[i])){
				
				mapArr.put(charArr[i], mapArr.get( charArr[i] ) + 1);
			}
			else{
				
				mapArr.put(charArr[i], 1);
				
			}
		}
		
		String truncatedString = "";
		 
		for(int i=0; i< charArr.length; i++){
			
			if (mapArr.get(charArr[i]) == 1){
				
				truncatedString = truncatedString + charArr[i];
				
			} 
			
		}
		System.out.print(truncatedString);
	}

}
