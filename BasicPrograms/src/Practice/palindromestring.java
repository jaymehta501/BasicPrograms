package Practice;

import java.util.Scanner;

public class palindromestring {

	public palindromestring() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String checkPalindrome=scannerObject.nextLine();
		
		String newString = "";

		
		for(int i=checkPalindrome.length() -1 ;i>=0;i--) {
			newString=newString+checkPalindrome.charAt(i);
		}
		if(checkPalindrome.equals(newString)){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

//for(j=2;j<input.length();j++) {
//	  for(i=0;i<input.lenght()-j; i++) {
//	        if(input.charAt[i] == input.charAt[j]) {
//	            //apply palindrome logic
//	            }
