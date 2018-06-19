package StringExample;

import java.util.HashMap;
import java.util.Scanner;

public class ConcatenatedStringUncommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String usr1 = sc.next();
		
		System.out.println("Enter String2 : ");
		String usr2 = sc.next();
		
		printConcatenatedUncommonCharacters(usr1, usr2);
		
	}

	public static void printConcatenatedUncommonCharacters(String usr1, String usr2){
		
		char[] charArr1 = usr1.toCharArray();
		char[] charArr2 = usr2.toCharArray();
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for (int i=0; i< charArr1.length; i++){
			if(map1.containsKey(charArr1[i])){
				map1.put(charArr1[i], map1.get(charArr1[i])+1);
			}else {
				map1.put(charArr1[i], 1);
			}
		}
		
		for (int i=0; i< charArr2.length; i++){
			if(map2.containsKey(charArr2[i])){
				map2.put(charArr2[i], map2.get(charArr2[i])+1);
			}else {
				map2.put(charArr2[i], 1);
			}
		}
		
		for (int i = 0; i < usr1.length(); i++){
			if(map2.get(charArr1[i]) == null){
				System.out.print(charArr1[i]);
			}
		}
		
		for (int i = 0; i < usr2.length(); i++){
			if(map1.get(charArr2[i]) == null){
				System.out.print(charArr2[i]);
			}
		}
	}
	
}
