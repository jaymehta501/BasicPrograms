package Practice;

import java.util.Scanner;

public class StringIntroduction {

	public StringIntroduction() {
		// TODO Auto-generated constructor stub
	}
	
		public static void main(String srgs[]) {
		Scanner scannerObject = new Scanner(System.in);
		
		String str1,str2;
		int len1,len2,totalLength = 0;
		
		System.out.print("Enter First String: ");
		str1=scannerObject.nextLine();
		
		System.out.print("Enter Second String: ");
		str2=scannerObject.nextLine();
		
		len1=str1.length();
		len2=str2.length();
		totalLength=len1+len2;
		
		System.out.println("Total length of two strings is: "+totalLength); //output 1
		
		if(str1.compareTo(str2) > 0)
		{
			System.out.println("Yes"); //output 2
		} else {
			System.out.println("No"); //output 2
		}
		str1=(str1.substring(0,1)).toUpperCase()+str1.substring(1);
	    str2=(str2.substring(0,1)).toUpperCase()+str2.substring(1);
		System.out.println("Combined strings: "+str1+" "+str2); //output 3
	}
}

