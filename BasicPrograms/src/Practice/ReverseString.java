package Practice;

import java.util.Scanner;

public class ReverseString {

	public ReverseString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args){
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse: ");
		String original = scannerObject.nextLine();
		String reverse="";
		int len = original.length();
		
		//usig rev method
		
//		String reverse = new StringBuffer(original).reverse().toString();
//			      System.out.println("\nString before reverse:"+original);
//			      System.out.println("String after reverse:"+reverse);
				 
	      for ( int i = len - 1 ; i >= 0 ; i-- ) {
	          reverse = reverse + original.charAt(i);
	      }	 
	      System.out.println("Reverse of entered string is: "+reverse);
	      System.out.println("Result with recursion "+ reverseString(original));
	}
	
	public static String reverseString(String str){
		
		String reverse="";
        
        if(str.length() == 1){
            return str;
        } else {
            reverse = reverse + str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    } 
}
