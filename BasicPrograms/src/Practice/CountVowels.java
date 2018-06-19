package Practice;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter a String: ");
		
		Scanner sc = new Scanner(System.in);
		String inputStrUser = sc.next();
		
		int counter = 0;
		
		char[] chrArr = inputStrUser.toCharArray();
		
		for (int i=0; i < chrArr.length; i++){
			
			switch(chrArr[i]){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				counter++;
			
			break;
			
			default :
			
			
			}
		
			
		}
		System.out.print(counter);
	}

}
