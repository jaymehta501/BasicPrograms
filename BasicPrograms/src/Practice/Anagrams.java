package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public Anagrams() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Scanner scannerObject = new Scanner(System.in);
		
		String str1,str2;
		char[] s1Array;
		char[] s2Array;
		
		System.out.print("Enter First String: ");
		str1=scannerObject.nextLine();
		
		System.out.print("Enter Second String: ");
		str2=scannerObject.nextLine();
		
		int len1,len2;
		len1=str1.length();
		len2=str2.length();
		
		if(len1 == len2) {
			
			s1Array=str1.toCharArray();
			s2Array=str2.toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

					if(Arrays.equals(s1Array, s2Array)) {
						System.out.println("Anagrams");
					}
					else {
						System.out.println("Not Anagrams");
					}
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
}
