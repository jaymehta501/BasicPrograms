package StringExample;

import java.util.HashMap;
import java.util.Scanner;

//Longest subsequence where every character appears at-least k times

public class LongestSubsequenceCharacterRepeated {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String usr1 = sc.next();
		
		System.out.println("Enter Number: ");
		int usrNum = sc.nextInt();
		
		generateLongestSubsequence(usr1, usrNum);
		
	}
	
	public static void generateLongestSubsequence(String usr1, int usrNum){
	
	char[] arr1 = usr1.toCharArray();
	
	HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	
	for (int i=0; i<arr1.length; i++){
		if  (map.containsKey(arr1[i])){
			map.put(arr1[i], map.get(arr1[i])+1);
		} else {
			map.put(arr1[i], 1);
		}
	}
	
	for (int i = 0; i< usr1.length(); i++){
		
		if (map.get(usr1.charAt(i)) >= usrNum){
			
		System.out.print(usr1.charAt(i));	
		}
	}
	
	}
}
