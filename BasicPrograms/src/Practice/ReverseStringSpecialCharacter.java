package Practice;

public class ReverseStringSpecialCharacter {  
	   public static void main(String[] args) {  
	     System.out.println(reverseString("man ish#"));  
	   }  
	   /**  
	    * Reverse a string with maintaining special character position.  
	    * Algorithm :  
	    * 1) Let input string be 'str[]' and length of string be 'n'  
	    * 2) l = 0, r = n-1  
	    * 3) While l is smaller than r, do following  
	    * a) If str[l] is not an alphabetic character, do l++  
	    * b) Else If str[r] is not an alphabetic character, do r--  
	    * c) Else swap str[l] and str[r]  
	    *  
	    * @param input : Input string  
	    * @return reverse string  
	    */ 
	   public static String reverseString(String input) {  
	     char[] inputArr = input.toCharArray();  
	     int l = 0;  
	     int r = inputArr.length - 1;  
	     while (l < r) {  
	       if (!Character.isAlphabetic(inputArr[l])) {  
	         l++;  
	       } else if (!Character.isAlphabetic(inputArr[r])) {  
	         r--;  
	       } else {  
	         char tempChar = inputArr[l];  
	         inputArr[l] = inputArr[r];  
	         inputArr[r] = tempChar;  
	         l++;  
	         r--;  
	       }  
	     }  
	     return new String(inputArr);  
	   }  
	 } 
